package com.greenfoxacademy.programmerfoxclub.Service;

import com.greenfoxacademy.programmerfoxclub.Model.Drink;
import com.greenfoxacademy.programmerfoxclub.Model.Food;
import com.greenfoxacademy.programmerfoxclub.Model.Fox;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

@Service
public class FoxService {

  private List<Fox> foxes = new ArrayList<>();
  private Fox loggedInFox = new Fox();

  public List<Fox> addFox(String name, String food, String drink){
    foxes.add(new Fox(name, food, drink));
    return foxes;
  }

  public List<Fox> getFoxes(){
    return foxes;
  }

  public Fox getLoggedInFox() {
    return loggedInFox;
  }

  public void setLoggedInFox(String name) {
    this.loggedInFox = getFox(name);
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

  public List<String> getFoods(){
    return Arrays.stream(Food.values())
        .map(f -> f.toString().toLowerCase().contains("_")?f.toString().toLowerCase().replace("_", " "):f.toString().toLowerCase())
        .collect(Collectors.toList());
  }

  public List<String> getDrinks(){
    return Arrays.stream(Drink.values())
        .map(d -> d.toString().toLowerCase().contains("_")?d.toString().toLowerCase().replace("_", " "):d.toString().toLowerCase())
        .collect(Collectors.toList());
  }

}
