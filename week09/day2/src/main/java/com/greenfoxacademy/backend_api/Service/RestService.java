package com.greenfoxacademy.backend_api.Service;

import com.greenfoxacademy.backend_api.Models.Appended;
import com.greenfoxacademy.backend_api.Models.ArrayHandler;
import com.greenfoxacademy.backend_api.Models.ArrayResult;
import com.greenfoxacademy.backend_api.Models.DoublingResult;
import com.greenfoxacademy.backend_api.Models.ErrorMessage;
import com.greenfoxacademy.backend_api.Models.Result;
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

  public Result handleArray(ArrayHandler arrayHandler){
    int[] numbers = arrayHandler.getNumbers();
    int result = 0;
    if (arrayHandler.getWhat().equals("sum")){
      for (int i = 0; i < numbers.length; i++) {
        result += numbers[i];
      }
      return new Result(result);
    } else if (arrayHandler.getWhat().equals("multiply")){
      result = 1;
      for (int i = 0; i < numbers.length; i++) {
        result = result * numbers[i];
      }
      return new Result(result);
    }
    return null;
  }

  public ArrayResult handleArrayIfDouble(ArrayHandler arrayHandler){
    int[] numbers = arrayHandler.getNumbers();
    int[] doubledNumbers = new int[numbers.length];
    for (int i = 0; i < numbers.length; i++) {
      doubledNumbers[i] = numbers[i] * 2;
    }
    return new ArrayResult(doubledNumbers);
  }

  public ErrorMessage handleArrayError(){
    return new ErrorMessage("Please provide what to do with the numbers!");
  }


}
