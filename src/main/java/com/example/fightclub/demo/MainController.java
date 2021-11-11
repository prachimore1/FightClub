package com.example.fightclub.demo;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @PostMapping
    @ResponseBody()
    ResponseData fightSomething() throws JsonProcessingException {
        System.out.println("Its Fighting!!!");
        return new ResponseData("in_channel", "Dirt Tacos 🌮🌮🌮🌮");
    }
}

class ResponseData {
    String response_type;
    String text;

    public ResponseData(String response_type, String text) {
        this.response_type = response_type;
        this.text = text;
    }

    public String getResponse_type() {
        return response_type;
    }

    public String getText() {
        return text;
    }
}