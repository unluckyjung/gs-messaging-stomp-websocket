package com.example.messagingstompwebsocket.dto;

public class MessageRequestDTO {
    private String name;

    public MessageRequestDTO() {
    }

    public MessageRequestDTO(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }
}
