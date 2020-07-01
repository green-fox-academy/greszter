package com.greenfoxacademy.springstart.controllers;

public class Greeting {

  protected long id;
  protected String content;

  public Greeting(long id, String content) {
    this.id = id;
    this.content = content;
  }

  public long getId() {
    return id;
  }

  public String getContent() {
    return content;
  }
}
