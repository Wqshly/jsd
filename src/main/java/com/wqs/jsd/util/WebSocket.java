package com.wqs.jsd.util;

import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author: wan
 * @Date: Created in 16:59 2020/2/14
 * @Description:
 * @Modified By:
 */
@ServerEndpoint("/websocket/{username}")
public class WebSocket {
    private static int count = 0;
    private static Map<String, WebSocket> client = new ConcurrentHashMap<>();
    private String username;
    private Session session;

    @OnOpen
    public void onOpen(@PathParam("username") String username, Session session) throws IOException {
        this.username = username;
        this.session = session;
        addCount();
        client.put(username, this);
    }

    @OnMessage
    public void onMessage(String message, Session session) throws IOException {
        System.out.println(message);
        try {
            sendMessage(message);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @OnClose
    public void onClose() throws IOException {
        client.remove(username);
        subCount();
    }

    private static synchronized void addCount() {
        WebSocket.count++;
    }

    private static synchronized void subCount() {
        WebSocket.count--;
    }

    private void sendMessage(String message) throws IOException {
        this.session.getAsyncRemote().sendText(message);
    }

}
