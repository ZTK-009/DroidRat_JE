using WebSocketSharp;
using WebSocketSharp.Server;

namespace WebSocket_JE
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