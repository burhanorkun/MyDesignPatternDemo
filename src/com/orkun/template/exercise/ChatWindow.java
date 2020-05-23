package com.orkun.template.exercise;

public class ChatWindow extends Window {

    @Override
    protected void onClosed() {
        System.out.println("Disconnecting from the server...");
    }
}
