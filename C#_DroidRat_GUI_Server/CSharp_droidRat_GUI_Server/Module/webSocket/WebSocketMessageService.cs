using WebSocketSharp;
using WebSocketSharp.Server;

namespace CSharp_droidRat_GUI_Server.Module.webSocket
{
    public class WebSocket : WebSocketBehavior
    {
        protected override void OnMessage(MessageEventArgs e)
        {
            var data = e.Data;
            Send(e.Data);
        }
    }
}