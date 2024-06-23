package com.amigoscode.springbootexample.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class CustomerController {

    private CustomerService customerService;
    
    @Autowired
    public CustomerController(CustomerService customerService){
        this.customerService = customerService;
    }

    @GetMapping("/customer")
   List<Customer> getCustomer() {
        return customerService.getCustomer();
        // return Arrays.asList(
        //     new Customer(1L, "Dinesh Jani"),
        //     new Customer(2L, "Yuvi")
        // );
    }
}
