package com.amigoscode.springbootexample.customer;
import java.util.*;

// import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
// @Primary
public class CustomerRepository implements CustomerRepo{
    @Override
    public List<Customer> getCustomers() {
                 return Arrays.asList(
            new Customer(1L, "Todo", "123"));
     }
}
