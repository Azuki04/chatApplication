package com.example.chatapplication.config;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.messaging.SessionDisconnectEvent;

@Component
@RequiredArgsConstructor
@Slf4j
public class WebSocketEventListener {
    public void hadnleWebSocketDisconnectionListener(SessionDisconnectEvent event ){
    //TODO: handle disconnection
    }
}
