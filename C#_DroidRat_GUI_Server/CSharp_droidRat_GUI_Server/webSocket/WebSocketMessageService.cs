using System;
using WebSocketSharp;
using WebSocketSharp.Server;

namespace WebSocket_JE
{
    public class WebSocket : WebSocketBehavior
    {
        protected override void OnMessage(MessageEventArgs e)
        {
            var data = e.Data;
            Console.WriteLine(e.Data);
            Send(e.Data);
        }
    }
}