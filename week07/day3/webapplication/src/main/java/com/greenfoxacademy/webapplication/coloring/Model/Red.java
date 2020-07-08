package com.greenfoxacademy.webapplication.coloring.Model;

import com.greenfoxacademy.webapplication.coloring.Service.MyColor;

public class Red implements MyColor {
  @Override
  public void printColor() {
    System.out.println("This color is red");
  }
}
