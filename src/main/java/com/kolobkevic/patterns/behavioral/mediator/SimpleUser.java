package com.kolobkevic.patterns.behavioral.mediator;

public class SimpleUser implements User{
    Chat chat;
    String name;

    public String getName() {
        return name;
    }

    public SimpleUser(Chat chat, String name) {
        this.chat = chat;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void sendMessage(String message) {
        chat.sendMessage(message, this);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println(this.name + " receiving message " + message);
    }
}
