package com.orkun.adapter.exercise;

import com.orkun.adapter.exercise.gmail.GmailClient;

public class GmailAdapter extends GmailClient implements EmailProvider {
    private GmailClient client = new GmailClient();

    @Override
    public void downloadEmails() {
        client.connect();
        client.getEmails();
        client.disconnect();
    }
}
