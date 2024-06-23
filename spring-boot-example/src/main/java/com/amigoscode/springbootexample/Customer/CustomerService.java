package com.amigoscode.springbootexample.customer;

import java.util.*;

// import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.amigoscode.springbootexample.exception.NotFoundException;


@Service
public class CustomerService {
    // private final CustomerRepo customerRepo;
    private final CustomerRepository customerRepository;

    // public CustomerService(@Qualifier("fake") CustomerRepo customerRepo){
    //     this.customerRepo = customerRepo;
    // }
    //     @Autowired
    //     public CustomerService(CustomerRepo customerRepo){
    //     this.customerRepo = customerRepo;
    // }

    public CustomerService(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;

    }
    public List<Customer> getCustomer() {
        return customerRepository.findAll();
    }

    Customer getCustomerById(Long Id ) {
        // return getCustomer().stream().filter(customer -> customer.getId().equals(Id)).findFirst().orElseThrow(() -> new NotFoundException("customer not found"));
        return customerRepository.findById(Id).orElseThrow(() -> new NotFoundException("customer not found"));
    }
    
}
