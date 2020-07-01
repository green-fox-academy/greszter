package com.greenfoxacademy.springstart;

public class CountAndGreet {

  protected long greetCount;
  protected String name;

  public CountAndGreet(String name, long greetCount) {
    this.greetCount = greetCount;
    this.name = name;
  }

  public String getContent() {
    return ("Hello, " + this.name + "! This site was loaded " + this.greetCount + " times since last server start.");
  }

}
