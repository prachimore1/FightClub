package com.example.fightclub.client;

import com.example.fightclub.domain.Creature;
import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.client.WireMock;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.options;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SlackClientTest {

    WireMockServer server;
    SlackConfig config = new SlackConfig("test_token", "http://localhost:8090/postMessage");
    SlackClient client = new SlackClient(config);

    @BeforeEach
    void setUp() {
        this.server = new WireMockServer(options().port(8090));
        this.server.start();
        WireMock.configureFor("localhost", 8090);
    }

    @AfterEach
    void tearDown() {
        server.stop();
    }

    @Test
    void postsNewFightOnSlack_Success() {
        server.stubFor(post(urlMatching("/postMessage"))
                .willReturn(aResponse().withBody("Posted a new fight")));
        Creature creature = new Creature("test title", "test image");

        String response = client.startFight(creature, List.of("test-channel"));

        assertEquals(response, "Posted a new fight");
        verify(postRequestedFor(urlEqualTo("/postMessage")));
    }

}