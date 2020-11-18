using System;
using System.Net.Http;
using System.Reflection;
using System.Resources;
using System.Windows.Forms;
using WesocketServer_JE;

namespace CSharp_droidRat_GUI_Server
{
    public partial class Form1 : Form
    {
        private WebSocketServerJE WebSocketServerJe;
        private ResourceManager ResourceManager;

        public Form1()
        {
            InitializeComponent();
            ResourceManager = new ResourceManager("item",Assembly.GetExecutingAssembly());
        }

        private void Form1_Load(object sender, EventArgs e)
        {
        }

        private void CloseButton_Click(object sender, EventArgs e)
        {
            WebSocketServerJe.Close();
        }

        private void ConnectButton_Click(object sender, EventArgs e)
        {
            if (!String.IsNullOrWhiteSpace(urlBox.Text) && urlBox.Text != null)
            {
                WebSocketServerJe = new WebSocketServerJE(urlBox.Text);
                WebSocketServerJe.Connect();
            }
            else
            {
                MessageBox.Show(ResourceManager.GetString("Url_Warning"));
            }
        }
    }
}