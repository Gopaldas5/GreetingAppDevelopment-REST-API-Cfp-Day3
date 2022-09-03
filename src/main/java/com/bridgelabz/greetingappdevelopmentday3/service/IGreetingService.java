package com.bridgelabz.greetingappdevelopmentday3.service;


import com.bridgelabz.greetingappdevelopmentday3.model.GreetingData;

import java.util.List;
import java.util.Optional;

public abstract class IGreetingService {

    public abstract GreetingData addGreeting(GreetingData iGreetingService);

    public abstract Optional<GreetingData> findGreetingID(int id);

    public abstract void deleteGreetingID(int id);

    public abstract List<GreetingData> findAllGreets();

}
