package com.amigoscode.springbootexample.Customer;
import java.util.*;

import org.springframework.stereotype.Component;

@Component
public class CustomerRepository implements CustomerRepo{
    @Override
    public List<Customer> getCustomers() {
        return Collections.emptyList();
     }
}
