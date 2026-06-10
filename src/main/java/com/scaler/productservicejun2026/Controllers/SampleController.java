package com.scaler.productservicejun2026.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/*
http://localhost:8080/sample/hello
 */

@RestController
@RequestMapping("/sample")
public class SampleController {

    @GetMapping("hello")
    public String sayHello(){
        return "Hello Vishal Welcome";
    }

    @GetMapping("/bye")
    public String sayBye(){
       return "Bye Vishal take care";
    }
}
