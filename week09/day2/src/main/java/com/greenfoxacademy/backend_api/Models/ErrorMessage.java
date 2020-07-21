package com.greenfoxacademy.backend_api.Models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class ErrorMessage {

  private String error;

  public ErrorMessage(String error){
    this.error = error;
  }

}
