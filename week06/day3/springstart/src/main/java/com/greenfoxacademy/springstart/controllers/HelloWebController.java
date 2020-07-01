package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.CountAndGreet;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class HelloWebController {

  @RequestMapping("/web/greeting")
  public String greeting(Model model) {
    model.addAttribute("name", " World");
    return "greeting";
  }

//  @RequestMapping("/web/greeting")
//  public String greetAndAskForName(@RequestParam String name) {
//    return new CountAndGreet(name);
//  }


}
