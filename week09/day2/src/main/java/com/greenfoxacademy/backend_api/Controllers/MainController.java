package com.greenfoxacademy.backend_api.Controllers;

import com.greenfoxacademy.backend_api.Models.ArrayHandler;
import com.greenfoxacademy.backend_api.Models.Log;
import com.greenfoxacademy.backend_api.Models.SithInput;
import com.greenfoxacademy.backend_api.Models.Until;
import com.greenfoxacademy.backend_api.Service.LogService;
import com.greenfoxacademy.backend_api.Service.RestService;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

  private RestService service;
  private LogService logService;

  @Autowired
  public MainController(RestService service, LogService logService) {
    this.service = service;
    this.logService = logService;
  }

  @GetMapping("/doubling")
  public ResponseEntity<? extends Object> doubling(
      @RequestParam(required = false, name = "input") Integer input) {
    Log log = new Log("doubling", "input=" + String.valueOf(input));
    this.logService.saveLog(log);
    if (input == null) {
      return ResponseEntity.ok(this.service.doublingError());
    } else {
      return ResponseEntity.ok(this.service.doubling(input));
    }
  }

  @GetMapping("/greeter")
  public ResponseEntity<? extends Object> greeter(
      @RequestParam(required = false, name = "name") String name,
      @RequestParam(required = false, name = "title") String title) {
    Log log = new Log("greeter", "name=" + name + " title=" + title);
    logService.saveLog(log);
    if (name == null || title == null) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST)
          .body(this.service.greetingError(name, title));
    } else {
      return ResponseEntity.ok(this.service.greeting(name, title));
    }
  }

  @GetMapping("/appenda/{appendable}")
  public ResponseEntity<? extends Object> appendA(
      @PathVariable(name = "appendable") String appendable) {
    Log log = new Log("appenda", "appendable=" + appendable);
    logService.saveLog(log);
    if (appendable == null) {
      return ResponseEntity.status(HttpStatus.BAD_GATEWAY).body("");
    } else {
      return ResponseEntity.ok(this.service.appendA(appendable));
    }
  }

  @PostMapping("/dountil/{action}")
  public ResponseEntity<? extends Object> dountil(@PathVariable(name = "action") String action,
                                                  @RequestBody Until until) {
    Integer number = until.getUntil();
    Log log = new Log("dountil", "action=" + action + " until=" + String.valueOf(number));
    logService.saveLog(log);
    if (number == null) {
      return ResponseEntity.ok(this.service.dountilError());
    } else if (action.equals("factor")) {
      return ResponseEntity.ok(this.service.factorUntil(number));
    } else if (action.equals("sum")) {
      return ResponseEntity.ok(this.service.sumUntil(number));
    }
    return null;
  }

  @PostMapping("/arrays")
  public ResponseEntity<? extends Object> arrayHandler(@RequestBody ArrayHandler arrayHandler) {
    Log log = new Log("arrays", "what=" + arrayHandler.getWhat() + " numbers=" +
        Arrays.toString(arrayHandler.getNumbers()));
    logService.saveLog(log);
    if (arrayHandler.getWhat().isEmpty() || arrayHandler.getNumbers().length == 0) {
      return ResponseEntity.ok(this.service.handleArrayError());
    }
    if (arrayHandler.getWhat().equals("double")) {
      return ResponseEntity.ok(this.service.handleArrayIfDouble(arrayHandler));
    } else {
      return ResponseEntity.ok(this.service.handleArray(arrayHandler));
    }
  }

  @GetMapping("/log")
  public ResponseEntity<? extends Object> log() {
    return ResponseEntity.ok(this.logService.getLogCount());
  }

  @PostMapping("/sith")
  public ResponseEntity<? extends Object> sithReverser(@RequestBody (required = false) SithInput sithInput){
    if (sithInput.getText().isEmpty()){
      return ResponseEntity.ok(this.service.sithError());
    } else
      return ResponseEntity.ok(this.service.sithReverse(sithInput));
  }


}
