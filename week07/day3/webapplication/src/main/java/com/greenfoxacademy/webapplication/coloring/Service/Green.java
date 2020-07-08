package com.greenfoxacademy.webapplication.coloring.Service;

import com.greenfoxacademy.webapplication.hellobeanworld.Service.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Green implements MyColor {

  @Autowired
  Printer printer;

  @Override
  public void printColor() {
    printer.log("This color is green");
  }
}
