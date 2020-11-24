package com.capgemini.web.springdemo.controller;

import com.capgemini.web.springdemo.model.User;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hellocontroller")
public class HelloWorldController {
    @RequestMapping(value = { "", "/", "/hello" })
    public String sayHello() {
        return "Hello World!!!";
    }

    @RequestMapping(value = { "/hello/query" }, method = RequestMethod.GET)
    public String sayHello(@RequestParam(value = "fName") String name) {
        return "Hello " + name + " !!!";
    }

    @PostMapping("/hello/post")
    public String sayHello(@RequestBody User user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " !!!";
    }

    @PutMapping("/hello/put/{firstName}")
    public String sayHello(@PathVariable String firstName, @RequestParam(value = "lastName") String lastName) {
        return "Hello " + firstName + " " + lastName + " !!!";
    }
}
