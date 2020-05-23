package com.orkun.adapter.exercise;

import com.orkun.adapter.exercise.gmail.GmailClient;

public class Demo {

    public static void main(String[] args) {
        var client = new EmailClient();
        //client.addProvider(new GmailClient());
        client.addProvider(new GmailAdapter());
        client.downloadEmails();
    }
}
