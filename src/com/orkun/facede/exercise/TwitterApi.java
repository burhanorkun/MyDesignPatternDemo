package com.orkun.facede.exercise;

import java.util.List;

public class TwitterApi {
    private String appKey;
    private String secret;

    public TwitterApi(String appKey, String secret) {
        this.appKey = appKey;
        this.secret = secret;
    }

    public List<Tweet> getRecentTweets() {
        var twitterClient = new TwitterClient();
        var tweets = twitterClient.getRecentTweets(getAccessToken());

        return tweets;
    }

    private String getAccessToken() {
        var auth = new OAuth();
        var requestToken = auth.requestToken(appKey, secret);
        var accessToken = auth.getAccessToken(requestToken);

        return accessToken;
    }
}
