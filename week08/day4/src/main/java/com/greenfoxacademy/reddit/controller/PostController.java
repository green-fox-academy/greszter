package com.greenfoxacademy.reddit.controller;

import com.greenfoxacademy.reddit.service.PostService;
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

  @Autowired
  public PostController(PostService postService) {
    this.postService = postService;
  }

  @GetMapping("/")
  public String main(Model model){
    model.addAttribute("posts", postService.getPosts());
    return "index";
  }

  @GetMapping("/submit")
  public String submit(){
    return "submit";
  }

  @PostMapping("/submit")
  public String submitURL(@RequestParam String title, @RequestParam String url){
    this.postService.savePost(title, url);
    return "redirect:/index";
  }

  @GetMapping("/{id}/addpoint")
  public String addPoint(@PathVariable(name = "id") Long id){
    this.postService.addPoint(id);
    return "redirect:/";
  }

  @GetMapping("/{id}/subtractpoint")
  public String subtractPoint(@PathVariable(name = "id") Long id){
    this.postService.subtractPoint(id);
    return "redirect:/";
  }

}
