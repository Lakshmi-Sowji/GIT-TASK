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
	Dont you open up the window
		dont you let out the antidote
		in the hills thats all we know // i only wrote the song 
		in the 90210 // playing in my headphones
		//no judgin' i know codin'
		//im just not frontin'
		//damn thats a rap line
    }  
}  
