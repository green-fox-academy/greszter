package com.greenfoxacademy.connection_with_mysql.Repository;

import com.greenfoxacademy.connection_with_mysql.Model.Todo;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long> {
  List<Todo> findAllByDoneIsFalse();

}
