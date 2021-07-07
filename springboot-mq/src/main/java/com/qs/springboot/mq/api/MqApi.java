package com.qs.springboot.mq.api;

import com.qs.springboot.mq.service.SimpleSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("mq")
public class MqApi {
    @Autowired
    SimpleSender simpleSender;

    @GetMapping("getAdmin")
    public boolean getAdmin(@RequestParam String message) {
        simpleSender.send(message);
        return true;
    }
}
