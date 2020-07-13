package com.greenfoxacademy.listing_todos_from_embedded_db;

import com.greenfoxacademy.listing_todos_from_embedded_db.Model.Todo;
import com.greenfoxacademy.listing_todos_from_embedded_db.Repository.TodoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ListingTodosFromEmbeddedDbApplication {

  public static void main(String[] args) {
    SpringApplication.run(ListingTodosFromEmbeddedDbApplication.class, args);
  }

  @Bean
  public CommandLineRunner todoDatabase(TodoRepository todoRepository){
    return args -> {

      todoRepository.save(new Todo("Start the day"));
      todoRepository.save(new Todo("Finish H2 workshop 1"));
      todoRepository.save(new Todo("Finish JPA workshop 2"));
      todoRepository.save(new Todo("Create CRUD project"));

      for (Todo todos : todoRepository.findAll()){
        System.out.println(todos.getId() + " | " + todos.getTitle() + " | " + todos.isUrgent() + " | " + todos.isDone());
      }



    };
  }

}
