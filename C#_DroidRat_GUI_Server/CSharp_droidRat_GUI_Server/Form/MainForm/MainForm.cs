using System;
using System.Diagnostics;
using System.Net.Http;
using System.Reflection;
using System.Resources;
using System.Windows.Forms;
using WesocketServer_JE;
using static System.String;

namespace CSharp_droidRat_GUI_Server
{
    public partial class Form1 : Form
    {
        private WebSocketServerJE _webSocketServerJe;

        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {
        }

        private void ConnectButton_Click(object sender, EventArgs e)
        {
            if (IsNullOrWhiteSpace(urlBox.Text))
            {
                MessageBox.Show(@"No url warning");
            }
            else
            {
                try
                {
                    _webSocketServerJe = new WebSocketServerJE(urlBox.Text);
                    _webSocketServerJe.Connect();
                }
                catch (Exception exception)
                {
                    MessageBox.Show(@"host error");
                    throw;
                }
            }
        }

        private void CloseButton_Click(object sender, EventArgs e)
        {
            _webSocketServerJe.Close();
        }
    }
}