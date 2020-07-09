package com.greenfoxacademy.programmerfoxclub.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Fox {

  private String name;
  private String food;
  private String drink;
  private List<Tricks> tricks = new ArrayList<>();

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

  public String getTricks() {
    return tricks.isEmpty()?"No tricks yet. Time to learn something new...":tricks.toString();
  }

  public int getTrickNumber(){
    return tricks.isEmpty()?0:tricks.size();
  }

  public void setTricks(List<Tricks> tricks) {
    this.tricks = tricks;
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
