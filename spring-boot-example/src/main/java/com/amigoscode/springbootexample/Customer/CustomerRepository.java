package com.amigoscode.springbootexample.customer;
import java.util.*;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CustomerRepository implements CustomerRepo{
    @Override
    public List<Customer> getCustomers() {
        return Collections.emptyList();
     }
}
