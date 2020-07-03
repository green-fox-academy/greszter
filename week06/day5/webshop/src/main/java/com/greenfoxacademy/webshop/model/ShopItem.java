package com.greenfoxacademy.webshop.model;

public class ShopItem {

  private String name;
  private String description;
  private Integer price;
  private Integer quantityOfStock;

  public ShopItem(String name, String description, Integer price, Integer quantityOfStock) {
    this.name = name;
    this.description = description;
    this.price = price;
    this.quantityOfStock = quantityOfStock;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Integer getPrice() {
    return price;
  }

  public void setPrice(Integer price) {
    this.price = price;
  }

  public Integer getQuantityOfStock() {
    return quantityOfStock;
  }

  public void setQuantityOfStock(Integer quantityOfStock) {
    this.quantityOfStock = quantityOfStock;
  }
}
