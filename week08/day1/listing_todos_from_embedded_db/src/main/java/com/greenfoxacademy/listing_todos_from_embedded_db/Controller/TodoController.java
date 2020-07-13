package com.greenfoxacademy.listing_todos_from_embedded_db.Controller;

import com.greenfoxacademy.listing_todos_from_embedded_db.Repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TodoController {

  private TodoRepository todoRepository;

  @Autowired
  public TodoController(
      TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  @GetMapping("/todo")
  public String todo(){
    return null;
  }

  @GetMapping("/")
  public String list(Model model){
    model.addAttribute("todos", todoRepository.findAll());
    return "todolist";
  }

  @GetMapping("/list")
  public String list2(){
    return "This is my first Todo";
  }

}
