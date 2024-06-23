package com.amigoscode.springbootexample.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    private CustomerService customerService;
    
    @Autowired
    public CustomerController(CustomerService customerService){
        this.customerService = customerService;
    }

    @GetMapping
   List<Customer> getCustomer() {
        return customerService.getCustomer();
        // return Arrays.asList(
        //     new Customer(1L, "Dinesh Jani"),
        //     new Customer(2L, "Yuvi")
        // );
    }

    @GetMapping(path = "{customerId}")
    Customer getCustomerById(@PathVariable("customerId") Long Id ) {
         return customerService.getCustomerById(Id);
     }

    @PostMapping
    void createNewCustomer(@RequestBody Customer customer){
        System.out.println("Post Requests");
        System.out.println(customer);
    }

    @PutMapping
    void updateCustomer(@RequestBody Customer customer){
        System.out.println("Update Requests");
        System.out.println(customer);
    }

    @DeleteMapping(path = "{customerId}")
    void deleteCustomer(@PathVariable("customerId") Long id){
        System.out.println("Delete Request for customer with ID " + id);
    }

}
