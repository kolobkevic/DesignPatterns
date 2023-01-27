package com.kolobkevic.patterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class SimpleChat implements Chat{
    private User admin;
    private List<User> users = new ArrayList<>();

    public void setAdmin(User admin) {
        this.admin = admin;
    }

    public void addUser(User user){
        users.add(user);
    }

    @Override
    public void sendMessage(String message, User user) {
        for (User u: users){
            if(u!=user){
                u.receiveMessage(message);
            }
        }
        admin.receiveMessage(message);
    }
}
