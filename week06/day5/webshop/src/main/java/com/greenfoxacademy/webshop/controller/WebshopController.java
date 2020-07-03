package com.greenfoxacademy.webshop.controller;

import com.greenfoxacademy.webshop.model.Currency;
import com.greenfoxacademy.webshop.model.ItemType;
import com.greenfoxacademy.webshop.model.ShopItem;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class WebshopController {

  List<ShopItem> items = Arrays.asList(
    new ShopItem("Running Shoes", "Nike running shoes for everyday sport", 1000, 5, ItemType.CLOTHES_AND_SHOES),
    new ShopItem("Printer", "Some HP printer", 3000, 2, ItemType.ELECTRONICS),
    new ShopItem("Coca Cola", "0.5l standard coke", 25, 0, ItemType.FOOD_AND_BEVERAGES),
    new ShopItem("Wokin", "Chicken with fired rice and WOKIN sauce", 119, 100, ItemType.FOOD_AND_BEVERAGES),
    new ShopItem("T-shirt", "Blue with a corgi on a bike", 300, 1, ItemType.CLOTHES_AND_SHOES),
    new ShopItem("Nike bag", "Black backpack", 1500, 4, ItemType.CLOTHES_AND_SHOES)
);

  @GetMapping("/")
  public String getItems(Model model) {
    model.addAttribute("items", getItems());
    return "index";
  }

  public List<ShopItem> getItems(){
    return items;
  }

  @GetMapping("/available")
  public String getAvailable(Model model) {
    model.addAttribute("items", available());
    return "index";
  }

  public List<ShopItem> available() {
    return items.stream()
        .filter(i -> i.getQuantityOfStock() > 0)
        .collect(Collectors.toList());
  }

  @GetMapping("/cheapestFirst")
  public String cheapestFirst(Model model) {
    model.addAttribute("items", cheapestToMostExpensive());
    return "index";
  }

  public List<ShopItem> cheapestToMostExpensive() {
    return items.stream()
        .sorted((i1, i2) -> i1.getPriceNumber().compareTo(i2.getPriceNumber()))
        .collect(Collectors.toList());
  }

  @GetMapping("/containsNike")
  public String containsNike(Model model) {
    model.addAttribute("items", getNike());
    return "index";
  }

  public List<ShopItem> getNike() {
    return items.stream()
        .filter(i -> i.getName().toLowerCase().contains("nike") ||
            i.getDescription().toLowerCase().contains("nike"))
        .collect(Collectors.toList());
  }


  @GetMapping("/stockAverage")
  public String stockAverage(Model model) {
    model.addAttribute("introString", "Stock average is: ");
    model.addAttribute("find", getStockAverage());
    return "find";
  }

  public String getStockAverage() {
    OptionalDouble average = items.stream()
        .mapToInt(ShopItem::getQuantityOfStock)
        .average();

    return average.isPresent()?String.format("%.2f", average.getAsDouble()):"Stock is empty";
  }

  @GetMapping("/mostExpensive")
  public String mostExpensive(Model model) {
    model.addAttribute("introString", "The most expensive item is: ");
    model.addAttribute("find", getMostExpensive().getName());
    return "/find";
  }

  public ShopItem getMostExpensive() {
    Optional<ShopItem> mostExpensive = items.stream()
        .max(Comparator.comparing(ShopItem::getPriceNumber));

    return mostExpensive.isPresent()?mostExpensive.get():new ShopItem("Unknown", null, null, null, null);
  }

  @GetMapping("/search")
  public String search(String search, Model model) {
    model.addAttribute("items", getSearchResult(search));
    return "index";
  }

  public List<ShopItem> getSearchResult(String search){
    return items.stream()
        .filter(i -> i.getName().toLowerCase().contains(search) ||
            i.getDescription().toLowerCase().contains(search))
        .collect(Collectors.toList());
  }

  @GetMapping("/foodAndBeverages")
  public String getFoodAndBev(Model model){
    model.addAttribute("items", filterByType(ItemType.FOOD_AND_BEVERAGES));

    return "index";
  }

  @GetMapping("/clothesAndShoes")
  public String getClothesAndShoes(Model model){
    model.addAttribute("items", filterByType(ItemType.CLOTHES_AND_SHOES));

    return "index";
  }

  @GetMapping("/electronics")
  public String getElectronics(Model model){
    model.addAttribute("items", filterByType(ItemType.ELECTRONICS));

    return "index";
  }

  public List<ShopItem> filterByType(ItemType type){
    return items.stream()
        .filter(i -> i.getType().equals(type))
        .collect(Collectors.toList());
  }

//  @GetMapping("/eur")
//  public String getPriceInEuro(Model model){
//    model.addAttribute("items", euroConverter());
//
//    return "index";
//  }
//
//  public void euroConverter(){
//    items.stream()
//        .forEach(i -> i.setPrice(i.getPrice((Currency.EURO)));
//  }



}
