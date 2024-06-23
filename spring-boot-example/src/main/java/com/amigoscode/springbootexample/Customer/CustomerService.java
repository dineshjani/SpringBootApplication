package com.amigoscode.springbootexample.Customer;

import java.util.*;

import org.springframework.stereotype.Component;;


@Component
public class CustomerService {
    private final CustomerRepo customerRepo;

    public CustomerService(CustomerRepo customerRepo){
        this.customerRepo = customerRepo;
    }
    public List<Customer> getCustomer() {
        return customerRepo.getCustomers();
    }
    
}
