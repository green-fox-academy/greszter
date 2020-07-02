package com.greenfoxacademy.thymeleaf_workshop.model;

public class BankAccount {

  private String name;
  private Float balance;
  private AnimalType animalType;

  public BankAccount(String name, Float balance, AnimalType animalType) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getBalance() {
    return String.format("%.2f", balance);
  }

  public void setBalance(Float balance) {
    this.balance = balance;
  }

  public String getAnimalType() {
    if (animalType.equals(AnimalType.LION)) {
      return "lion";
    }
    if (animalType.equals(AnimalType.MEERKAT)) {
      return "meerkat";
    }
    if (animalType.equals(AnimalType.WARTHOG)) {
      return "warthog";
    }
    if (animalType.equals(AnimalType.RED_BILLED_HORNBILL)) {
      return "red-billed hornbill";
    }
    if (animalType.equals(AnimalType.LION_KING)) {
      return "lion king";
    }
    return null;
  }

  public void setAnimalType(AnimalType animalType) {
    this.animalType = animalType;
  }

  public String getKingStyleClass() {
    return this.animalType.equals(AnimalType.LION_KING) ? "king" : "";
  }

  public String goodOrBad() {
    return this.balance >= 500f ? "Good Guy" : "Bad Guy";
  }
}
