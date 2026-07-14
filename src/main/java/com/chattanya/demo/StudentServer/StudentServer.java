package com.chattanya.demo.StudentServer;

import org.springframework.web.bind.annotation.*;


@RestController
public class StudentServer {
    //Store the student method;
    @PostMapping("/add")
    public String storeStudent(){
        return """
                Id: 28,
                Name: Chattanya,
                Department: CSE,
                Age: 20
                """;
    }
    //Read the statement
}
