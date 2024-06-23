package com.amigoscode.springbootexample.customer;
import java.util.List;

import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component(value = "fake")
public class CustomerFakeRepository implements CustomerRepo {
    @Override
    public List<Customer> getCustomers() {
        return Arrays.asList(
            new Customer(1L, "Dinesh Jani"),
            new Customer(2L, "Yuvi")
        );
     }
}
