package com.greenfoxacademy.backend_api.Models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class DoublingResult {

  private Integer received;
  private Integer result;

  public DoublingResult(Integer received, Integer result) {
    this.received = received;
    this.result = result;
  }
}
