package com.amigoscode.springbootexample.customer;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Service
public class CustomerService {
    private final CustomerRepo customerRepo;

    // public CustomerService(@Qualifier("fake") CustomerRepo customerRepo){
    //     this.customerRepo = customerRepo;
    // }
        @Autowired
        public CustomerService(CustomerRepo customerRepo){
        this.customerRepo = customerRepo;
    }
    public List<Customer> getCustomer() {
        return Arrays.asList(
            new Customer(1L, "Todo"));
    }
    
}
