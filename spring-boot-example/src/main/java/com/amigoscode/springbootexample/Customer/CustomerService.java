package com.amigoscode.springbootexample.customer;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.amigoscode.springbootexample.exception.NotFoundException;


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
        return customerRepo.getCustomers();
    }

    Customer getCustomerById(Long Id ) {
        return customerRepo.getCustomers().stream().filter(customer -> customer.getId().equals(Id)).findFirst().orElseThrow(() -> new NotFoundException("customer not found"));
    }
    
}
