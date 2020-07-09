package com.greenfoxacademy.programmerfoxclub.Service;

import com.greenfoxacademy.programmerfoxclub.Model.Fox;
import com.greenfoxacademy.programmerfoxclub.Model.Tricks;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

@Service
public class FoxList {

  List<Fox> foxes = new ArrayList<>();

  public List<Fox> addFox(String name, String food, String drink){
    foxes.add(new Fox(name, food, drink));
    return foxes;
  }

  public List<Fox> getFoxes(){
    return foxes;
  }

  public Fox getFox(String name){
    return foxes.stream()
        .filter(f -> f.getName().equals(name))
        .findFirst()
        .orElse(new Fox("unknown", null, null));
  }

  @Override
  public String toString() {
    return foxes.stream()
        .map(f -> f.getName())
        .collect(Collectors.toList())
        .toString();
  }

}
