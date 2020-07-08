package com.greenfoxacademy.webapplication.hellobeanworld.Model;

import java.time.LocalDateTime;
import org.springframework.stereotype.Service;

@Service
public class Printer {
  public void log(String message) {
    System.out.println(LocalDateTime.now() + " MY PRINTER SAYS --- " + message);
  }
}