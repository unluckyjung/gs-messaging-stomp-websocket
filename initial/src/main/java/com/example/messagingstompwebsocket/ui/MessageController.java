package com.example.messagingstompwebsocket.ui;

import com.example.messagingstompwebsocket.dto.MessageRequestDTO;
import com.example.messagingstompwebsocket.dto.MessageResponseDTO;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class MessageController {
    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public MessageResponseDTO greeting(final MessageRequestDTO messageRequestDTO) {
        return new MessageResponseDTO("Hello : " + messageRequestDTO.getName() + "!");
    }
}
