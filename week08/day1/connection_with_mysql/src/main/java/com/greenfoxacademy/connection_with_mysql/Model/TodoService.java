package com.greenfoxacademy.connection_with_mysql.model;

import com.greenfoxacademy.connection_with_mysql.repository.TodoRepository;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

  private Todo todo;
  private TodoRepository todoRepository;

  public Todo getTodo(Long id){
    if (todoRepository.findById(id).isPresent()){
      return todoRepository.findById(id).get();
    } else {
      return null;
    }
  }
}
