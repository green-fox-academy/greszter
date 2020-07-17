package com.greenfoxacademy.reddit.controller;

import com.greenfoxacademy.reddit.service.PostService;
import com.greenfoxacademy.reddit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PostController {

  private PostService postService;
  private UserService userService;

  @Autowired
  public PostController(PostService postService, UserService userService) {
    this.postService = postService;
    this.userService = userService;
  }

  @GetMapping("/")
  public String main(Model model) {
    model.addAttribute("posts", postService.getFirstTenInOrder());
    return "index";
  }

  @GetMapping("/submit")
  public String submit() {
    return "submit";
  }

  @PostMapping("/submit")
  public String submitURL(@RequestParam String title, @RequestParam String url) {
    this.postService.savePost(title, url);
    return "redirect:/";
  }

  @GetMapping("/{id}/addpoint")
  public String addPoint(@PathVariable(name = "id") Long id) {
    this.postService.addPoint(id);
    return "redirect:/";
  }

  @GetMapping("/{id}/subtractpoint")
  public String subtractPoint(@PathVariable(name = "id") Long id) {
    this.postService.subtractPoint(id);
    return "redirect:/";
  }

  @GetMapping("/register")
  public String register(Model model, @RequestParam(required = false) Boolean error) {
    if (error != null && error) {
      model.addAttribute("errorMessage", "This username is taken!");
    }
    return "register";
  }

  @PostMapping("/register")
  public String redditRegister(@RequestParam String name, @RequestParam String password) {
    if (this.userService.getUsers().contains(this.userService.getByName(name))) {
      return "redirect:/register/?error=true";
    }
    this.userService.addUser(name, password);
    return "redirect:/";
  }

  @GetMapping("/login")
  public String login(Model model, @RequestParam(required = false) Boolean error, @RequestParam(required = false) Boolean pwderror) {
    if (error != null && error) {
      model.addAttribute("errorMessage", "Please add a real name!");
    } if (pwderror != null && pwderror) {
      model.addAttribute("errorMessage", "Wrong password! Try again!");
    }
    return "login";
  }

  @PostMapping("/login")
  public String loginPost(@RequestParam String name, @RequestParam String password) {
    if (name.isEmpty() || password.isEmpty()) {
      return "redirect:/login/?error=true";
    } else if (this.userService.findUser(name, password) != null) {
      this.userService.logIn(name, password);
      return "redirect:/";
    } else if (this.userService.wrongPassword(name, password) == true) {
      return "redirect:/login/?pwderror=true";
    }
    else {
      return "redirect:/register";
    }
  }

  @GetMapping("/logout")
  public String logout(@RequestParam String name, @RequestParam String password) {
    this.userService.findUser(name, password).setActive(false);
    return "redirect:/";
  }

}
