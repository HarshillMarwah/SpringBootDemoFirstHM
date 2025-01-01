package com.learning.SpringBootTesting.repository;

import com.learning.SpringBootTesting.model.Laptop;
import org.springframework.stereotype.Repository;

//@Component
@Repository
public class LaptopRepository {
    public void save(Laptop lap){
        System.out.println("Saved in DB");
    }
}
