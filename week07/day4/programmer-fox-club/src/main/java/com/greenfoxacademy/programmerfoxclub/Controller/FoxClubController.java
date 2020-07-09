package com.greenfoxacademy.programmerfoxclub.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FoxClubController {

  @GetMapping("/")
  public String getMain(){
    return "index";
  }

  @GetMapping("/information")
  public String getInfo(){
    return "information";
  }

}
