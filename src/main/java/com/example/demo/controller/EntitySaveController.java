package com.example.demo.controller;

import com.example.demo.Service.MyService;
import com.example.demo.model.Client;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class EntitySaveController {

    @Autowired
    MyService myService;

    @GetMapping("user")
    public void saveSomething(User user){
        myService.saveEntity(user);
    }
    @GetMapping("client")
    public void saveSomething(Client user){
        myService.saveEntity(user);
    }
}
