package com.greenfoxacademy.webshop.controller;

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

  final Double kcToEur = 0.037;
  final Double kcToHuf = 13.22;

  List<ShopItem> items = Arrays.asList(
      new ShopItem("Running Shoes", "Nike running shoes for everyday sport", 1000.00, 5,
          ItemType.CLOTHES_AND_SHOES),
      new ShopItem("Printer", "Some HP printer", 3000.00, 2, ItemType.ELECTRONICS),
      new ShopItem("Coca Cola", "0.5l standard coke", 25.00, 0, ItemType.FOOD_AND_BEVERAGES),
      new ShopItem("Wokin", "Chicken with fired rice and WOKIN sauce", 119.00, 100,
          ItemType.FOOD_AND_BEVERAGES),
      new ShopItem("T-shirt", "Blue with a corgi on a bike", 300.00, 1, ItemType.CLOTHES_AND_SHOES),
      new ShopItem("Nike bag", "Black backpack", 1500.00, 4, ItemType.CLOTHES_AND_SHOES)
  );

  @GetMapping("/")
  public String getItems(Model model) {
    model.addAttribute("currency", "Kč");
    model.addAttribute("items", items);
    return "index";
  }

  public List<ShopItem> getItems() {
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

    return average.isPresent() ? String.format("%.2f", average.getAsDouble()) : "Stock is empty";
  }

  @GetMapping("/mostExpensive")
  public String mostExpensive(Model model) {
    model.addAttribute("introString", "The most expensive item is: ");
    model.addAttribute("find", getMostExpensive().getName());
    return "/find";
  }

  public ShopItem getMostExpensive() {
    Optional<ShopItem> mostExpensive = items.stream()
        .max(Comparator.comparing(ShopItem::getPrice));

    return mostExpensive.isPresent() ? mostExpensive.get() :
        new ShopItem("Unknown", null, null, null, null);
  }

  @GetMapping("/search")
  public String search(String search, Model model) {
    model.addAttribute("items", getSearchResult(search));
    return "index";
  }

  public List<ShopItem> getSearchResult(String search) {
    return items.stream()
        .filter(i -> i.getName().toLowerCase().contains(search) ||
            i.getDescription().toLowerCase().contains(search))
        .collect(Collectors.toList());
  }

  @GetMapping("/more-filters")
  public String moreFilters(){
    return "filters";
  }

  @GetMapping("/foodAndBeverages")
  public String getFoodAndBev(Model model) {
    model.addAttribute("items", filterByType(ItemType.FOOD_AND_BEVERAGES));

    return "index";
  }

  @GetMapping("/clothesAndShoes")
  public String getClothesAndShoes(Model model) {
    model.addAttribute("items", filterByType(ItemType.CLOTHES_AND_SHOES));

    return "index";
  }

  @GetMapping("/electronics")
  public String getElectronics(Model model) {
    model.addAttribute("items", filterByType(ItemType.ELECTRONICS));

    return "index";
  }

  public List<ShopItem> filterByType(ItemType type) {
    return items.stream()
        .filter(i -> i.getType().equals(type))
        .collect(Collectors.toList());
  }

  @GetMapping("/eur")
  public String getPriceInEuro(Model model) {

    model.addAttribute("currency", "€");
    model.addAttribute("items", euroConverter());

    return "index";
  }

  public List<ShopItem> euroConverter() {
    List<ShopItem> EUR = items.stream()
        .map(i -> i.convertPrice(kcToEur))
        .collect(Collectors.toList());

    return EUR;
  }

  @GetMapping("/huf")
  public String getPriceInHuf(Model model) {
    model.addAttribute("currency", "Ft");
    model.addAttribute("items", hufConverter());

    return "index";
  }

  public List<ShopItem> hufConverter() {
    return items.stream()
        .map(i -> i.convertPrice(kcToHuf))
        .collect(Collectors.toList());

  }

  @GetMapping("/above")
  public String above(Integer priceFilter, Model model) {
    model.addAttribute("items", filterAbove(priceFilter));
    return "index";
  }

  public List<ShopItem> filterAbove(Integer priceFilter) {
    return items.stream()
        .filter(i -> i.getPrice() > priceFilter.doubleValue())
        .collect(Collectors.toList());
  }

  @GetMapping("/below")
  public String below(Integer priceFilter, Model model) {
    model.addAttribute("items", filterBelow(priceFilter));
    return "index";
  }

  public List<ShopItem> filterBelow(Integer priceFilter) {
    return items.stream()
        .filter(i -> i.getPrice() < priceFilter.doubleValue())
        .collect(Collectors.toList());
  }

  @GetMapping("/exactly")
  public String exactly(Integer priceFilter, Model model) {
    model.addAttribute("items", filterExactly(priceFilter));
    return "index";
  }

  public List<ShopItem> filterExactly(Integer priceFilter) {
    return items.stream()
        .filter(i -> i.getPrice() == priceFilter.doubleValue())
        .collect(Collectors.toList());
  }

}
