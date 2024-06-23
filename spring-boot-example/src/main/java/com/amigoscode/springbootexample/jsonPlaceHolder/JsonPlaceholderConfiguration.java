package com.amigoscode.springbootexample.jsonPlaceHolder;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JsonPlaceholderConfiguration {
    
    @Bean("jsonplaceholder")
    CommandLineRunner runner(JsonPlaceHolderClient jsonPlaceholderClient) {
        return args -> { 
            System.out.println("https://jsonplaceholder.typicode.com/posts");
            System.out.println(jsonPlaceholderClient.getPosts().size());
            System.out.println("https://jsonplaceholder.typicode.com/posts/1");
            System.out.println(jsonPlaceholderClient.getPostById(1L));
        };
    }
}
