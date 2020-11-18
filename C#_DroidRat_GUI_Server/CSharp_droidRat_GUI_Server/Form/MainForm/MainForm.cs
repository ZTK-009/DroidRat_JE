using System;
using System.Diagnostics;
using System.Windows.Forms;
using WesocketServer_JE;
using static System.String;

namespace CSharp_droidRat_GUI_Server.Form.MainForm
{
    public partial class Form1 : System.Windows.Forms.Form
    {
        private WebSocketServerJe _webSocketServerJe;

        public Form1()
        {
            InitializeComponent();
        }

        private void ConnectButton_Click(object sender, EventArgs e)
        {
            if (IsNullOrWhiteSpace(urlBox.Text))
                MessageBox.Show(@"No url warning");
            else
                try
                {
                    _webSocketServerJe = new WebSocketServerJe(urlBox.Text);
                    _webSocketServerJe?.Connect();
                }
                catch (Exception exception)
                {
                    MessageBox.Show(@"host error");
                    Debug.WriteLine(exception);
                }
        }

        private void CloseButton_Click(object sender, EventArgs e)
        {
            _webSocketServerJe?.Close();
        }
    }
}