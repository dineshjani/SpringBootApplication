package com.amigoscode.springbootexample.Customer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class CustomerController {

    private CustomerService customerService;

    @GetMapping("/customer")
   List<Customer> getCustomer() {
        return customerService.getCustomer();
    }
}
