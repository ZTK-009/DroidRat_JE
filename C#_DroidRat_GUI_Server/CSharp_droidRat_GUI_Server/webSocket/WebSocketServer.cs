using System;
using WebSocket_JE;
using WebSocketSharp.Server;

namespace WesocketServer_JE
{
    public class WebSocketServerJE
    {

        private WebSocketServer webSocketServer;
        public WebSocketServerJE(string url1)
        {
            webSocketServer = new WebSocketServer(url1);
            webSocketServer.AddWebSocketService<WebSocket>("/websocket");
        }

        public void Connect()
        {
            webSocketServer.Start();
        }

        public void Close()
        {
            webSocketServer.Stop();
        }
        
    }
}