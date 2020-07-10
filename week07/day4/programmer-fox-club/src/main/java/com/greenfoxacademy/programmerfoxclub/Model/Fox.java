package com.greenfoxacademy.programmerfoxclub.Model;

import java.util.ArrayList;
import java.util.List;

public class Fox {

  private String name;
  private String food;
  private String drink;
  private List<String> tricks = new ArrayList<>();

  public Fox(String name, String food, String drink) {
    this.name = name;
    this.food = food;
    this.drink = drink;
  }

  public Fox(){
    name = "Mr. Green";
    food = "pizza";
    drink = "lemonade";
  }

  @Override
  public String toString() {
    return name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<String> getTricks() {
    if (tricks.isEmpty()) {
      tricks.add("No tricks yet. Time to learn something new...");
    }
    return tricks;
  }

  public int getTrickNumber(){
    return tricks.isEmpty()?0:tricks.size();
  }

  public void addNewTrick(String trick) {
    this.tricks.add(trick);
  }

  public String getFood() {
    return food;
  }

  public void setFood(String food) {
    this.food = food;
  }

  public String getDrink() {
    return drink;
  }

  public void setDrink(String drink) {
    this.drink = drink;
  }
}
