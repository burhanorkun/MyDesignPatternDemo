package com.orkun.facede.exercise;

public class Demo {
    public void show(){
        /*var oauth = new OAuth();
        var requestToken = oauth.requestToken("appKey", "secret");
        var accessToken = oauth.getAccessToken(requestToken);

        var twitterClient = new TwitterClient();
        twitterClient.getRecentTweets(accessToken);
        */
        var twitterApi = new TwitterApi("appKey", "secret");
        var tweets = twitterApi.getRecentTweets();
    }

    public static void main(String[] args) {
        var demo = new Demo();
        demo.show();
    }
}
