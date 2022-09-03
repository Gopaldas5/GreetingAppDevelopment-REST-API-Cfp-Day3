package com.bridgelabz.greetingappdevelopmentday3.repository;


import com.bridgelabz.greetingappdevelopmentday3.model.GreetingData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface GreetingRepo extends JpaRepository<GreetingData, Integer> {

}