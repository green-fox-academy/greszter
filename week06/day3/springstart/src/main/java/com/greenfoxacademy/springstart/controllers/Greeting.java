package com.greenfoxacademy.springstart.controllers;

public class Greeting {

  protected long id;
  protected String content;
  protected String name;

  public Greeting(long id, String content,String name) {
    this.id = id;
    this.content = content;
    this.name = name;
  }

  public long getId() {
    return id;
  }

  public String getContent() {
    return (content + this.name + "!");
  }

}
