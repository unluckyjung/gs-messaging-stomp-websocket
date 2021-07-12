package com.example.messagingstompwebsocket.ui;

import com.example.messagingstompwebsocket.dto.MessageRequestDTO;
import com.example.messagingstompwebsocket.dto.MessageResponseDTO;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

@Controller
public class MessageController {

    private final SimpMessagingTemplate template;

    public MessageController(final SimpMessagingTemplate template) {
        this.template = template;
    }

    @MessageMapping("/chat/{roomName}")
    public void chat(@DestinationVariable String roomName, final MessageRequestDTO messageRequestDTO) {
        template.convertAndSend("/topic/" + roomName, MessageResponseDTO.of(messageRequestDTO));
    }
}
