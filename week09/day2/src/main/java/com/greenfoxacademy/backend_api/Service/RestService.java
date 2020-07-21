package com.greenfoxacademy.backend_api.Service;

import com.greenfoxacademy.backend_api.Models.DoublingResult;
import com.greenfoxacademy.backend_api.Models.ErrorMessage;
import org.springframework.stereotype.Service;

@Service
public class RestService {


  public DoublingResult doubling(Integer input){
    return new DoublingResult(input, input * 2);
  }

  public ErrorMessage doublingError(){
    return new ErrorMessage("Please provide an input!");
  }
}
