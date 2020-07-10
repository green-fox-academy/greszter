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
    if (name==null) {
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
  public String login(@RequestParam(required = false) String name) {
    return "login";
  }

  @PostMapping("/login")
  public String loginPost(@RequestParam String name) {
    foxService.setLoggedInFox(name);
    if (name.isEmpty()) {
      return "redirect:/login";
    } else if (foxService.toString().contains(name)) {
      return "redirect:/?name=" + name;
    } else {
      return "redirect:/register";
    }
  }

  @GetMapping("/register")
  public String register(@RequestParam(required = false) String name, Model model) {
    model.addAttribute("foodOptions", foxService.getFoods());
    model.addAttribute("drinkOptions", foxService.getDrinks());
    return "register";
  }

  @PostMapping("/register")
  public String registerFox(@RequestParam String name, @RequestParam String food, @RequestParam String drink) {
    foxService.addFox(name, food, drink);
    return "redirect:/login";
  }

  @GetMapping("/nutritionStore")
  public String getNutrition(Model model, @RequestParam(required = false) String name) {
    model.addAttribute("foodOptions", foxService.getFoods());
    model.addAttribute("drinkOptions", foxService.getDrinks());
    return "nutrition";
  }

  @PostMapping("/nutritionStore")
  public String setNutrition(@RequestParam String food, @RequestParam String drink) {
    if (foxService.getLoggedInFox() == null) {
      return "redirect:/login";
    } else {
      foxService.getLoggedInFox().setFood(food);
      foxService.getLoggedInFox().setDrink(drink);
      return "redirect:/?name=" + foxService.getLoggedInFox().getName();
    }
  }

  @GetMapping("/trickCenter")
  public String getTricks(Model model, @RequestParam(required = false) Boolean error,
                          @RequestParam(required = false) String name) {
    if (error != null && error) {
      model.addAttribute("errorMessage", "You can't learn it twice");
    }
    model.addAttribute("tricks", foxService.getTrickOptions());
    return "trick";
  }

  @PostMapping("/trickCenter")
  public String setTricks(@RequestParam(required = false) String trick) {
    if (foxService.getLoggedInFox() == null) {
      return "redirect:/login";
    } else if (foxService.getLoggedInFox().getTricks().contains(trick)) {
      return "redirect:/trickCenter/?error=true";
    } else {
      foxService.getLoggedInFox().addNewTrick(trick);
      return "redirect:/?name=" + foxService.getLoggedInFox().getName();
    }
  }


}
