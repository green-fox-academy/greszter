package com.greenfoxacademy.connection_with_mysql;

import com.greenfoxacademy.connection_with_mysql.Model.Todo;
import com.greenfoxacademy.connection_with_mysql.Repository.TodoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ConnectionWithMysqlApplication {

  public static void main(String[] args) {
    SpringApplication.run(ConnectionWithMysqlApplication.class, args);
  }

  @Bean
  public CommandLineRunner todoDatabase(TodoRepository todoRepository) {
    return args -> {

      for (Todo todos : todoRepository.findAll())
        System.out.println(
            todos.getId() + " | " + todos.getTitle() + " | " + todos.isUrgent() + " | " +
                todos.isDone());
    };
  }
}
