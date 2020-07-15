package com.greenfoxacademy.connection_with_mysql.controller;

import com.greenfoxacademy.connection_with_mysql.model.Todo;
import com.greenfoxacademy.connection_with_mysql.model.TodoService;
import com.greenfoxacademy.connection_with_mysql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TodoController {

  private TodoRepository todoRepository;
//  private TodoService todoService;

  @Autowired
  public TodoController(
      TodoRepository todoRepository, TodoService todoService) {
    this.todoRepository = todoRepository;
 //   this.todoService = todoService;
  }

  @GetMapping("/todo")
  public String todo() {
    return "todolist";
  }

  @GetMapping(value = {"/", "/list"})
  public String list(Model model) {
    model.addAttribute("todos", todoRepository.findAll());

    return "todolist";
  }

  @GetMapping("/addtodo")
  public String add(Model model) {
    model.addAttribute("newtodo", new Todo());
    return "addtodo";
  }

  @PostMapping("/addtodo")
  public String addNew(@ModelAttribute Todo todo, String title) {
    todoRepository.save(new Todo(title));
    return "redirect:/list";
  }

  @GetMapping("/{id}/delete")
  public String deleteItem(@PathVariable(name = "id") Long id, Model model) {
    todoRepository.deleteById(id);
    model.addAttribute("todos", todoRepository.findAll());
    return "redirect:/list";
  }

  @GetMapping("/{id}/update")
  public String update(@PathVariable(name = "id") Long id, Model model) {
      model.addAttribute("updatedTodo", todoRepository.findById(id).get());
      return "update";
  }

  @PostMapping("/{id}/update")
  public String updateTodo(@PathVariable(name = "id") Long id,
                           @RequestParam String title, @RequestParam(required = false) String done,
                           @RequestParam(required = false) String urgent) {

    Todo todo = todoRepository.findById(id).get();
    todo.setTitle(title);
    todo.setDone(done != null);
    todo.setUrgent(urgent != null);
    todoRepository.save(todo);
    return "redirect:/list";
  }

}
