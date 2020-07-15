package com.greenfoxacademy.connection_with_mysql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConnectionWithMysqlApplication {

  public static void main(String[] args) {
    SpringApplication.run(ConnectionWithMysqlApplication.class, args);
  }

//  @Bean
//  public CommandLineRunner todoDatabase(TodoRepository todoRepository) {
//    return args -> {
//
//      todoRepository.save(new Todo("daily task"));
//      todoRepository.save(new Todo("make the beds", true, true));
//      todoRepository.save(new Todo("do the washing up", true, false));
//      todoRepository.save(new Todo("clean the bathroom and the kitchen", true, true));
//      todoRepository.save(new Todo("wipe all the surfaces with a cloth", true, false));
//      todoRepository.save(new Todo("remove the grease", true, false));
//      todoRepository.save(new Todo("tidy up"));
//      todoRepository.save(new Todo("throw away the rubbish", true, true));
//      todoRepository.save(new Todo("broom", true, false));
//      todoRepository.save(new Todo("sweep the floor", true, true));
//      todoRepository.save(new Todo("wash the floors", true, false));
//      todoRepository.save(new Todo("mop", true, true));
//      todoRepository.save(new Todo("vacuum the carpet"));
//      todoRepository.save(new Todo("vacuum cleaner/hoover", true, true));
//      todoRepository.save(new Todo("dust the furniture", true, false));
//
//
////      for (Todo todos : todoRepository.findAll())
////        System.out.println(
////            todos.getId() + " | " + todos.getTitle() + " | " + todos.isUrgent() + " | " +
////                todos.isDone());
//
//
////      for (Todo todos : todoRepository.findAllByDoneIsFalse()) {
////        System.out.println(todos.getId() + " | " + todos.getTitle() + " | " + todos.isUrgent() + " | " +
////            todos.isDone());
////      }
//  };
//
//
//  }
}
