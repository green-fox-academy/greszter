package com.greenfoxacademy.backend_api.Service;

import com.greenfoxacademy.backend_api.Models.Appended;
import com.greenfoxacademy.backend_api.Models.DoublingResult;
import com.greenfoxacademy.backend_api.Models.ErrorMessage;
import com.greenfoxacademy.backend_api.Models.Result;
import com.greenfoxacademy.backend_api.Models.Until;
import com.greenfoxacademy.backend_api.Models.WelcomeMessage;
import org.springframework.stereotype.Service;

@Service
public class RestService {

  public DoublingResult doubling(Integer input) {
    return new DoublingResult(input, input * 2);
  }

  public ErrorMessage doublingError() {
    return new ErrorMessage("Please provide an input!");
  }

  public WelcomeMessage greeting(String name, String title) {
    return new WelcomeMessage(name, title);
  }

  public ErrorMessage greetingError(String name, String title) {
    if (name == null && title == null) {
      return new ErrorMessage("Please provide a name and a title!");
    } else if (name == null && title != null) {
      return new ErrorMessage("Please provide a name!");
    } else {
      return new ErrorMessage("Please provide a title!");
    }
  }

  public Appended appendA(String appendable){
    return new Appended(appendable);
  }

  public Result sumUntil(Integer number){
    int result = 0;
    for (int i = 0; i <= number; i++) {
      result += i;
    }
    return new Result(result);
  }

  public Result factorUntil(Integer number){
    int result = 1;
    for (int i = 1; i <= number; i++) {
      result = result * i;
    }
    return new Result(result);
  }

  public ErrorMessage dountilError(){
    return new ErrorMessage("Please provide a number!");
  }



}
