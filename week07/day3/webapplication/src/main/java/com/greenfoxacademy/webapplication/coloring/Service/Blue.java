package com.greenfoxacademy.webapplication.coloring.Service;

import org.springframework.stereotype.Service;

@Service
public class Blue implements MyColor {
  @Override
  public void printColor() {
    System.out.println("This color is blue");
  }
}
