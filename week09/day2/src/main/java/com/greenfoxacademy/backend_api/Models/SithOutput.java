package com.greenfoxacademy.backend_api.Models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class SithOutput {

  private String sith_text;

  public SithOutput(String sith_text) {
    this.sith_text = sith_text;
  }
}
