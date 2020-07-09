package com.greenfoxacademy.programmerfoxclub.Controller;

import com.greenfoxacademy.programmerfoxclub.Model.Fox;
import com.greenfoxacademy.programmerfoxclub.Service.FoxList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FoxClubController {

  private FoxList foxList;

  @Autowired
  public FoxClubController(FoxList foxList) {
    this.foxList = foxList;
  }

  @GetMapping("/")
  public String getMain(@RequestParam String name, Model model){
    model.addAttribute("name", name);
    model.addAttribute("food", foxList.getFox(name).getFood());
    model.addAttribute("drink", foxList.getFox(name).getDrink());
    model.addAttribute("trickNumber", foxList.getFox(name).getTrickNumber());
    return "index";
  }

  @GetMapping("/information")
  public String getInfo(){
    return "information";
  }

  @GetMapping("/login")
  public String login(){
    return "login";
  }

  @PostMapping("/login")
  public String loginPost(@RequestParam String name){
    return redirect(name);
  }

  public String redirect(String name){
    if (name.isEmpty()) {
      return "redirect:/login";
    } else if (foxList.toString().contains(name)){
      return "redirect:/?name=" + name;
    } else {
      return "redirect:/register";
    }
  }

  @GetMapping("/register")
  public String register(){
    return "register";
  }

  @PostMapping("/register")
  public String registerFox(@RequestParam String name, @RequestParam String food, @RequestParam String drink){
    foxList.addFox(name, food, drink);
    return "redirect:/login";
  }

}
