package com.greenfoxacademy.connection_with_mysql.Controller;

import com.greenfoxacademy.connection_with_mysql.Repository.TodoRepository;
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
    return "todolist";
  }

  @GetMapping(value = {"/", "/list"})
  public String list(Model model){
    model.addAttribute("todos", todoRepository.findAllByDoneIsFalse());

    return "todolist";
  }


}
