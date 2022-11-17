package com.demo.rest_service;

import netscape.javascript.JSObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class ApiController {

    @RequestMapping("/welcomeMe")
    public Map<String, String> welcomeMe(){
        HashMap<String, String> map = new HashMap<>();
        map.put("message", "Welcome {Rafi Uddin}");
        return map;
    }
}
