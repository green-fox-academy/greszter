package com.greenfoxacademy.backend_api.Models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class WelcomeMessage {

  private String welcome_message;

  public WelcomeMessage(String name, String title) {
    welcome_message = ("Oh, hi there " + name + ", my dear " + title + "!");
  }
  
}
