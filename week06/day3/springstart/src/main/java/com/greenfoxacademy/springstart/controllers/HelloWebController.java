package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.CountAndGreet;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//@Controller

public class HelloWebController {

  private static AtomicLong greetCount = new AtomicLong();

//  @RequestMapping("/web/greeting")
//  public String greeting(Model model) {
//    model.addAttribute("name", " World");
//    return "greeting";
//  }
//

  @RequestMapping("/web/greeting")
  public CountAndGreet countAndGreet(@RequestParam String name) {
    return new CountAndGreet(name, greetCount.incrementAndGet());
  }

}
