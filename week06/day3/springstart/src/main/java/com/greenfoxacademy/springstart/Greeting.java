package com.greenfoxacademy.springstart;

import java.util.concurrent.atomic.AtomicLong;

public class Greeting {

  protected long greetCount;
  protected String content;
  protected String name;

  public Greeting(String content, long greetCount, String name) {
    this.content = content;
    this.name = name;
    this.greetCount = greetCount;
  }

  public long getGreetCount() {
    return greetCount;
  }

  public String getContent() {
    return (content + this.name + "!");
  }

}
