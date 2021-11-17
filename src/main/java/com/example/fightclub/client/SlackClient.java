package com.example.fightclub.client;

import com.example.fightclub.domain.Creature;
import com.example.fightclub.domain.PostMessage;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class SlackClient {

    private final SlackConfig config;

    public SlackClient(SlackConfig config) {
        this.config = config;
    }

    public String startFight(Creature creature, List<String> channel_id) {

        RestTemplate restTemplate = config.getRestTemplate();

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setBearerAuth(config.appToken);

        PostMessage message = new PostMessage(channel_id.get(0), "Fight club welcomes you for a demo!", List.of(creature));

        HttpEntity<PostMessage> entity = new HttpEntity<>(message, headers);

        final ResponseEntity<String> responseEntity = restTemplate.postForEntity(config.postMessageUrl, entity, String.class);
        System.out.println(responseEntity.getBody());

        return responseEntity.getBody();
    }
}
