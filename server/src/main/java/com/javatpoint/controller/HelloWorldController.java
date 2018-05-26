package com.javatpoint.controller;  
import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.servlet.ModelAndView;  
@Controller  
public class HelloWorldController {  
    @RequestMapping("/hello")  
    public ModelAndView helloWorld() {  
        String message = "Hello World, Spring MVC @ Javatpoint";  
        return new ModelAndView("hello", "message", message);  
    }  
}



//adding comments to task1 by S
//java
