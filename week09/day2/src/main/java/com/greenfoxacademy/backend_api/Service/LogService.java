package com.greenfoxacademy.backend_api.Service;

import com.greenfoxacademy.backend_api.Models.Log;
import com.greenfoxacademy.backend_api.Models.LogCount;
import com.greenfoxacademy.backend_api.Repositories.LogRepository;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogService {

  private LogRepository logRepository;

  @Autowired
  public LogService(LogRepository logRepository) {
    this.logRepository = logRepository;
  }

  public void saveLog(Log log){
    this.logRepository.save(log);
  }

  public LogCount getLogCount(){
    LogCount logCount = new LogCount();
    logCount.setEntries(this.logRepository.findAll());
    logCount.setEntry_count(this.logRepository.findAll().size());
    return logCount;
  }





}


