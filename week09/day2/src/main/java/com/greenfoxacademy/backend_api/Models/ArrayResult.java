package com.greenfoxacademy.backend_api.Models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ArrayResult {

  private int[] result;

  public ArrayResult(int[] result) {
    this.result = result;
  }
}
