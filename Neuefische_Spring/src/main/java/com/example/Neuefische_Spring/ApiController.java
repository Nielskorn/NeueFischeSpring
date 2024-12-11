package com.example.Neuefische_Spring;

import org.apache.logging.log4j.message.Message;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path ="/api")
public class ApiController {
    List<Massage>messages=new ArrayList<>();


    @GetMapping("/hello/{name}")

    public String HelloWorld(@PathVariable String name) {
        return "Hello,"+name+"!";
    }

    @PostMapping("/messages")
    public String addMessage(@RequestBody Massage message) {
        messages.add(message);
        return "Message added!";
    }
    @GetMapping("/messages")
    public List<String> getMessages() {
        List<String> list=new ArrayList<>();
        for (Massage m : messages) {
            list.add(m.toString());
        }
        return list;
    }
    @DeleteMapping("/messages/{id}")
    public String deleteMessage(@PathVariable String id) {
        for (Massage m : messages) {
            if (m.getId().equals(id)) {
                messages.remove(m);
                return "Message deleted!";
            }
        }
        return "Message not found!";
    }




}
