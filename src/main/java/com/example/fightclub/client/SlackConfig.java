package com.example.fightclub.client;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class SlackConfig {
    String appToken;
    String postMessageUrl;

    public SlackConfig() {
        this.appToken = "xoxb-2739193187328-2713139330213-ZmsDp9Ai8LdLpY7TmzysSpD9";
        this.postMessageUrl = "https://slack.com/api/chat.postMessage";
    }

    public SlackConfig(String appToken, String postMessageUrl) {
        this.appToken = appToken;
        this.postMessageUrl = postMessageUrl;
    }

    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
