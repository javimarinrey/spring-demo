package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, world!";
    }

    @GetMapping("/json2")
    @ResponseBody
    public ResponseEntity<?> sendJson2() {
        Map<String, Object> map = new HashMap<>();
        map.put("message", "Hello, world!");
        return ResponseEntity.ok(map);
    }
}
