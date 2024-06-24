package com.amigoscode.springbootexample.appConfig;

import com.amigoscode.springbootexample.appConfig.MyAppProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyAppController {

    private final MyAppProperties myAppProperties;

    @Autowired
    public MyAppController(MyAppProperties myAppProperties) {
        this.myAppProperties = myAppProperties;
    }

    @GetMapping("/config")
    public MyAppProperties getConfig() {
        return myAppProperties;
    }
}
