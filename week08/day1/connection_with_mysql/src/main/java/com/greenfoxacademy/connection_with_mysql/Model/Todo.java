package com.greenfoxacademy.connection_with_mysql.model;

import javax.persistence.*;

@Entity
@Table
public class Todo {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String title;
  private Boolean urgent;
  private Boolean done;

  public Todo() {
  }

  public Todo(String title) {
    this.title = title;
    urgent = false;
    done = false;
  }

  public Todo(String title, Boolean done, Boolean urgent) {
    this.title = title;
    this.urgent = urgent;
    this.done = done;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public boolean isUrgent() {
    return urgent;
  }

  public void setUrgent(boolean urgent) {
    this.urgent = urgent;
  }

  public boolean isDone() {
    return done;
  }

  public void setDone(boolean done) {
    this.done = done;
  }
}
