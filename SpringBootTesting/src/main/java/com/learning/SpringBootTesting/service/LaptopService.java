package com.learning.SpringBootTesting.service;

import com.learning.SpringBootTesting.model.Laptop;
import com.learning.SpringBootTesting.repository.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {
    @Autowired
    private LaptopRepository repo;
    public void addLaptop(Laptop lap) {
        System.out.println("addLaptop method called");
        repo.save(lap);
    }
    public boolean isGoodForPrograming(Laptop lap){
        return true;
    }
}
