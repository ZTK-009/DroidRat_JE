using WebSocket_JE;
using WebSocketSharp.Server;

namespace WesocketServer_JE
{
    public class WebSocketServerJE
    {
        private WebSocketServer _webSocketServer;
        private bool _running = false;

        public WebSocketServerJE(string server)
        {
            _webSocketServer = new WebSocketServer(server);
            _webSocketServer.AddWebSocketService<WebSocket>("/websocket");
        }

        public void Connect()
        {
            if (_running != false) return;
            _webSocketServer.Start();
            _running = true;
        }

        public void Close()
        {
            if (_webSocketServer == null || _running != true) return;
            _webSocketServer.Stop();
            _running = false;
        }
    }
}