package com.bridgelabz.greetingappdevelopmentday3.service;


import com.bridgelabz.greetingappdevelopmentday3.model.GreetingData;
import com.bridgelabz.greetingappdevelopmentday3.repository.GreetingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class GreetingService extends IGreetingService {
    private static final String template = "Hello, %s";
    private final AtomicLong counter = new AtomicLong();
    @Autowired
    GreetingRepo greetingRepo;
    public GreetingData addGreeting(GreetingData iGreetingService){
        String msg = "Hello" + " " +iGreetingService.getFirstName()+ " " +iGreetingService.getLastName();
        iGreetingService.setMessage(msg);
        return greetingRepo.save(iGreetingService);
    }
    public Optional<GreetingData> findGreetingID(int id){
        return greetingRepo.findById(id);
    }
    public void deleteGreetingID(int id){
        greetingRepo.deleteById(id);
    }

    public List<GreetingData> findAllGreets(){
        return greetingRepo.findAll();
    }
}
