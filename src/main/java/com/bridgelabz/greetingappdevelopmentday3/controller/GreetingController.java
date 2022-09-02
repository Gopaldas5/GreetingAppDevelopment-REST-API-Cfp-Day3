package com.bridgelabz.greetingappdevelopmentday3.controller;


import com.bridgelabz.greetingappdevelopmentday3.model.GreetingData;
import com.bridgelabz.greetingappdevelopmentday3.service.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/greeting")
public class GreetingController {
    @Autowired
    IGreetingService iGreetingService;

//    http://localhost:8080/greeting
    @GetMapping(value = {"","/","greeting"})
    public String greeting(){
        return "Hello BridgeLabz";

    }
    @PostMapping("/adding")
    public  GreetingData addGreeting(@RequestBody GreetingData msg){
        return iGreetingService.addGreeting(msg);
    }
    @GetMapping("/find/{id}")
    public Optional<GreetingData> findGreeting(@PathVariable int id){
        return iGreetingService.findGreetingID(id);
    }
    @DeleteMapping("/{id}")
    public void deleteGreets(@PathVariable int id){
        iGreetingService.deleteGreetingID(id);
    }
    @GetMapping("/findAll")
    public  List<GreetingData> findAllGreeting(){
        return iGreetingService.findAllGreets();
    }

}
