package com.gevernova.messagingapp.controller;

import com.gevernova.messagingapp.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class MessageController {
    @Autowired
    private MessageService messageService;
    @GetMapping
    public String printMessage(){
        return messageService.printMessage();
    }
    @GetMapping("/{name}")
    public String printMessage(@PathVariable String name){
        return messageService.printMessage()+" "+name;
    }

}
