package com.greenfoxacademy.backend_api.Models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Appended {

  private String appended;

  public Appended(String appended) {
    this.appended = appended + "a";
  }
}

