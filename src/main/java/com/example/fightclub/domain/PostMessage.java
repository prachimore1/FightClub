package com.example.fightclub.domain;

import java.util.List;

public class PostMessage {
    String channel;
    String text;
    List<Creature> attachments;

    public PostMessage(String channel, String text, List<Creature> attachments) {
        this.channel = channel;
        this.text = text;
        this.attachments = attachments;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<Creature> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<Creature> attachments) {
        this.attachments = attachments;
    }
}
