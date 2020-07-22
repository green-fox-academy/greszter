package com.greenfoxacademy.backend_api.Repositories;

import com.greenfoxacademy.backend_api.Models.Log;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogRepository extends CrudRepository<Log, Long> {
  List<Log> findAll();

}
