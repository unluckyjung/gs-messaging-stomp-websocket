package com.example.messagingstompwebsocket.dto;

public class MessageResponseDTO {
    private String content;

    public MessageResponseDTO() {
    }

    public MessageResponseDTO(final String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
