package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.Greeting;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloRESTController {

  private static AtomicLong greetCount = new AtomicLong();

  @RequestMapping("/greeting")
  public Greeting greeting(@RequestParam String name){
    return new Greeting("Hello, ", greetCount.incrementAndGet(), name);
  }
}
