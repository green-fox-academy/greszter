package com.greenfoxacademy.connection_with_mysql.Controller;

import com.greenfoxacademy.connection_with_mysql.Model.Todo;
import com.greenfoxacademy.connection_with_mysql.Repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

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
    model.addAttribute("todos", todoRepository.findAll());

    return "todolist";
  }

  @GetMapping("/addtodo")
  public String add(Model model){
    model.addAttribute("newtodo", new Todo());
    return "addtodo";
  }

  @PostMapping("/addtodo")
  public String addNew(@ModelAttribute Todo todo, String title){
    todoRepository.save(new Todo(title));
    return "redirect:/list";
  }


}
