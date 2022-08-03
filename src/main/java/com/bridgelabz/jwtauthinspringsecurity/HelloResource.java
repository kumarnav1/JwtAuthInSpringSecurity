package com.bridgelabz.jwtauthinspringsecurity;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloResource {

    //this api will only accessible for authenticated users
    @RequestMapping({ "/hello" })
    public String firstPage() {
        return "Hello World";
    }
}
