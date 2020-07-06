package com.greenfoxacademy.webshop.model;

public class ShopItem {

  private String name;
  private String description;
  private Double price;
  private Integer quantityOfStock;
  private ItemType type;


  public ItemType getType() {
    return type;
  }

  public ShopItem(String name, String description, Double price, Integer quantityOfStock, ItemType type) {
    this.name = name;
    this.description = description;
    this.price = price;
    this.quantityOfStock = quantityOfStock;
    this.type = type;
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

  public Double getPrice() {
    return this.price;
  }
  public String getPriceAsString(){
    return String.format("%.2f", this.price);
  }


  public void setPrice(Double price) {
    this.price = price;
  }

  public Integer getQuantityOfStock() {
    return quantityOfStock;
  }

  public void setQuantityOfStock(Integer quantityOfStock) {
    this.quantityOfStock = quantityOfStock;
  }

  public ShopItem convertPrice(Double exchange){
    return new ShopItem(this.name, this.description, this.price * exchange, this.quantityOfStock, this.type);
  }

}
