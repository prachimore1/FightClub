package com.example.fightclub.domain;

import java.util.List;


class ResponseData {
    String response_type;
    String text;
    List<Creature> attachments;

    public ResponseData(String response_type, String text, List<Creature> attachments) {
        this.response_type = response_type;
        this.text = text;
        this.attachments = attachments;
    }

    public String getResponse_type() {
        return response_type;
    }

    public String getText() {
        return text;
    }

    public List<Creature> getAttachments() {
        return attachments;
    }
}
