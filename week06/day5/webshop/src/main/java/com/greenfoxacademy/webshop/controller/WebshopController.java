package com.greenfoxacademy.webshop.controller;

import com.greenfoxacademy.webshop.model.ShopItem;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class WebshopController {List<ShopItem> items = Arrays.asList(
    new ShopItem("Running Shoes", "Nike running shoes for everyday sport", 1000, 5),
    new ShopItem("Printer", "Some HP printer", 3000, 2),
    new ShopItem("Coca Cola", "0.5l standard coke", 25, 0),
    new ShopItem("Wokin", "Chicken with fired rice and WOKIN sauce", 119, 100),
    new ShopItem("T-shirt", "Blue with a corgi on a bike", 300, 1),
    new ShopItem("Nike bag", "Black backpack", 1500, 4)
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
        .sorted((i1, i2) -> i1.getPrice().compareTo(i2.getPrice()))
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
    return items.stream()
        .sorted((i1, i2) -> i2.getPrice().compareTo(i1.getPrice()))
        .findFirst()
        .orElse(new ShopItem("The shop is empty", null, null, null));
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


}
