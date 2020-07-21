package com.greenfoxacademy.backend_api.Controllers;

import com.greenfoxacademy.backend_api.Models.ErrorMessage;
import com.greenfoxacademy.backend_api.Service.RestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MainController {

  private RestService service;

  @Autowired
  public MainController(RestService service) {
    this.service = service;
  }

  @GetMapping("/")
  public String index(){
    return "index";
  }

  @GetMapping("/doubling")
  @ResponseBody
  public ResponseEntity<? extends Object> doubling(@RequestParam (required = false, name = "input") Integer input){
    if (input == null){
      return ResponseEntity.ok(this.service.doublingError());
    } else
      return ResponseEntity.ok(this.service.doubling(input));
  }
}
