package com.greenfoxacademy.backend_api.Models;

import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class LogCount {

  private List<Log> entries;
  private int entry_count;

}
