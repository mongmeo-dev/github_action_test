package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

  @GetMapping
  public String helloWorld() {
    return "helloWorld";
  }

  @GetMapping("test")
  public String test(String name) {
    return "Hello " + name;
  }
}
