package com.greenfoxacademy.backend_api.Models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Result {

  private Integer result;

  public Result(Integer result) {
    this.result = result;
  }
}
