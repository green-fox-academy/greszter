package com.greenfoxacademy.backend_api.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HtmlController {

  @GetMapping("/")
  public String index() {
    return "index";
  }

}
