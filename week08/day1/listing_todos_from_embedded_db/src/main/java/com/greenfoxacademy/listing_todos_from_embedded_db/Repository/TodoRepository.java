package com.greenfoxacademy.listing_todos_from_embedded_db.Repository;

import com.greenfoxacademy.listing_todos_from_embedded_db.Model.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long> {
}
