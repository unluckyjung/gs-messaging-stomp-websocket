package com.example.messagingstompwebsocket.dto;

public class MessageRequestDTO {
    private String name;
    private String content;

    public MessageRequestDTO() {
    }

    public MessageRequestDTO(final String name, final String content) {
        this.name = name;
        this.content = content;
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
