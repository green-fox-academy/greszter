package com.greenfoxacademy.webshop.model;

public class ShopItem {

  private String name;
  private String description;
  private Integer price;
  private Integer quantityOfStock;
  private ItemType type;
  private Currency currency;


  public ItemType getType() {
    return type;
  }

  public ShopItem(String name, String description, Integer price, Integer quantityOfStock, ItemType type) {
    this.name = name;
    this.description = description;
    this.price = price;
    this.quantityOfStock = quantityOfStock;
    this.type = type;
    this.currency = Currency.CZECH_KORUNA;
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
    return this.price;
  }

  public Integer getPriceNumber(){
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
