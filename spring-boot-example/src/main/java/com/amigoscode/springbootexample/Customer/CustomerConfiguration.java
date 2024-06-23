package com.amigoscode.springbootexample.customer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class CustomerConfiguration {
    @Value("${app.userFakeCustomerRepo: False}")
    private Boolean userFakeCustomerRepo;
    @Bean
    CommandLineRunner  commandLineRunner(){
        return args -> {
                   System.out.println("Command Line Runner");
        };
    }
    @Bean
    CustomerRepo customerRepo() {
        System.out.println("userFakeCustomerRepo = " + userFakeCustomerRepo);
           return userFakeCustomerRepo ? new CustomerFakeRepository() : new CustomerRepository();
    }
}
