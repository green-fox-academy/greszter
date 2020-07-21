package com.greenfoxacademy.backend_api.Controllers;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.greenfoxacademy.backend_api.Models.Until;
import com.greenfoxacademy.backend_api.Service.RestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

  private RestService service;

  @Autowired
  public MainController(RestService service) {
    this.service = service;
  }

  @GetMapping("/")
  public String index() {
    return "index";
  }

  @GetMapping("/doubling")
  @ResponseBody
  public ResponseEntity<? extends Object> doubling(
      @RequestParam(required = false, name = "input") Integer input) {
    if (input == null) {
      return ResponseEntity.ok(this.service.doublingError());
    } else {
      return ResponseEntity.ok(this.service.doubling(input));
    }
  }

  @GetMapping("/greeter")
  @ResponseBody
  public ResponseEntity<? extends Object> greeter(
      @RequestParam(required = false, name = "name") String name,
      @RequestParam(required = false, name = "title") String title) {
    if (name == null || title == null) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST)
          .body(this.service.greetingError(name, title));
    } else {
      return ResponseEntity.ok(this.service.greeting(name, title));
    }
  }

  @GetMapping("/appenda/{appendable}")
  @ResponseBody
  public ResponseEntity<? extends Object> appendA(
      @PathVariable(name = "appendable") String appendable) {
    if (appendable == null) {
      return ResponseEntity.status(HttpStatus.BAD_GATEWAY).body("");
    } else {
      return ResponseEntity.ok(this.service.appendA(appendable));
    }
  }

  @PostMapping("/dountil/{action}")
  @ResponseBody
  public ResponseEntity<? extends Object> dountil(@PathVariable(name = "action") String action,
                                                  @RequestBody Until until) {
    Integer number = until.getUntil();
    if (number == null) {
      return ResponseEntity.ok(this.service.dountilError());
    }  else if (action.equals("factor")) {
      System.out.println(this.service.factorUntil(number));
      return ResponseEntity.ok(this.service.factorUntil(number));
    } else if (action.equals("sum")) {
      System.out.println(this.service.sumUntil(number));
      return ResponseEntity.ok(this.service.sumUntil(number));
    }
    return null;
  }
}
