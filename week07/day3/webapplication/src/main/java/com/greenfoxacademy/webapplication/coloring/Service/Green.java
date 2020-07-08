package com.greenfoxacademy.webapplication.coloring.Service;
import org.springframework.stereotype.Service;

@Service
public class Green implements MyColor {
  @Override
  public void printColor() {
    System.out.println("This color is green");
  }
}
