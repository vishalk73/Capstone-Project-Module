package com.scaler.productservicejun2026.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/*
http://localhost:8080/sample/hello/vishal
 */

@RestController
@RequestMapping("/sample")
public class SampleController {

    @GetMapping("/hello/{name}/{numberOfTime}")
    public String sayHello(@PathVariable String name , @PathVariable("numberOfTime") int number){
        String response = "";
        for(int i=1;i<=number;i++){
            String s ="Hello "+name+"<br>";
            response+=s;
        }
        return response;
    }

    @GetMapping("/bye/{name}/{number}")
    public String sayBye(@PathVariable("name") String input , @PathVariable int number){
        String response ="";
        for(int i=1;i<=number;i++){
            String s = "bye "+input+"<br>";
            response+=s;
        }
       return response;
    }
}
