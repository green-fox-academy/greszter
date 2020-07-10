package com.greenfoxacademy.programmerfoxclub.Controller;

import com.greenfoxacademy.programmerfoxclub.Service.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FoxClubController {

  private FoxService foxService;

  @Autowired
  public FoxClubController(FoxService foxService) {
    this.foxService = foxService;
  }

  @GetMapping("/")
  public String getMain(@RequestParam (required = false) String name, Model model) {
    if (name == null) {
      return "redirect:/login";
    } else {
      model.addAttribute("name", name);
      model.addAttribute("food", foxService.getFox(name).getFood());
      model.addAttribute("drink", foxService.getFox(name).getDrink());
      model.addAttribute("trickNumber", foxService.getFox(name).getTrickNumber());
      model.addAttribute("trick", foxService.getFox(name).getTricks());
      return "index";
    }
  }

  @GetMapping("/login")
  public String login(@RequestParam(required = false) String name, Model model,
                      @RequestParam(required = false) Boolean error) {
    if (error != null && error) {
      model.addAttribute("errorMessage", "Please add a real name!");
    }
    return "login";
  }

  @PostMapping("/login")
  public String loginPost(@RequestParam String name) {
    if (name.isEmpty()) {
      return "redirect:/login/?error=true";
    } else if (foxService.toString().contains(name)) {
      return "redirect:/?name=" + name;
    } else {
      return "redirect:/register";
    }
  }

  @GetMapping("/register")
  public String register(Model model) {
    model.addAttribute("foodOptions", foxService.getFoods());
    model.addAttribute("drinkOptions", foxService.getDrinks());
    return "register";
  }

  @PostMapping("/register")
  public String registerFox(@RequestParam String name, @RequestParam String food,
                            @RequestParam String drink) {
    foxService.addFox(name, food, drink);
    return "redirect:/login";
  }

  @GetMapping("/nutritionStore")
  public String getNutrition(Model model, @RequestParam(required = false) String name) {
    model.addAttribute("name", name);
    model.addAttribute("foodOptions", foxService.getFoods());
    model.addAttribute("drinkOptions", foxService.getDrinks());
    return "nutrition";
  }

  @PostMapping("/nutritionStore")
  public String setNutrition(@RequestParam String food, @RequestParam String drink, @RequestParam (required = false) String name) {
    if (foxService.getFox(name) == null) {
      return "redirect:/login";
    } else {
      foxService.getFox(name).setFood(food);
      foxService.getFox(name).setDrink(drink);
      return "redirect:/?name=" + name;
    }
  }

  @GetMapping("/trickCenter")
  public String getTricks(Model model, @RequestParam(required = false) Boolean error,
                          @RequestParam(required = false) String name) {
    model.addAttribute("name", name);
    if (error != null && error) {
      model.addAttribute("errorMessage", "You can't learn it twice");
    } else if (foxService.getTrickOptions(name).isEmpty()) {
      model.addAttribute("emptyList", "Congratulations, you know everything!!!");
    } else {
      model.addAttribute("tricks", foxService.getTrickOptions(name));
    }
    return "trick";
  }

  @PostMapping("/trickCenter")
  public String setTricks(@RequestParam (required = false) String trick, @RequestParam(required = false) String name) {
    if (foxService.getFox(name) == null) {
      return "redirect:/login";
    } else if (foxService.getFox(name).getTricks().contains(trick)) {
      return "redirect:/trickCenter/?error=true";
    } else {
      foxService.getFox(name).addNewTrick(trick);
      return "redirect:/?name=" + name;
    }
  }


}
