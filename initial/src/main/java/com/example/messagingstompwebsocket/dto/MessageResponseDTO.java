package com.example.messagingstompwebsocket.dto;

public class MessageResponseDTO {
    private String name;
    private String content;

    public MessageResponseDTO() {
    }

    public MessageResponseDTO(final String name, final String content) {
        this.name = name;
        this.content = content;
    }

    public static MessageResponseDTO of(final MessageRequestDTO messageRequestDTO) {
        return new MessageResponseDTO(messageRequestDTO.getName(), messageRequestDTO.getContent());
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(final String content) {
        this.content = content;
    }
}
