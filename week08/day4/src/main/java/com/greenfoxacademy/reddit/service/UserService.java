package com.greenfoxacademy.reddit.service;

import com.greenfoxacademy.reddit.model.User;
import com.greenfoxacademy.reddit.repository.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

  private UserRepository userRepository;

  @Autowired
  public UserService(UserRepository userRepository){
    this.userRepository = userRepository;
  }

  public void addUser(String name, String password){
    if (this.userRepository.findByName(name) == null) {
      this.userRepository.save(new User(name, password));
    }
  }

  public User findUser(String name, String password){
    return this.userRepository.findByNameAndPassword(name, password);
  }

  public void logIn(String name, String password){
    User user = this.userRepository.findByNameAndPassword(name, password);
    if (user != null && !user.isActive()){
      user.setActive(true);
      this.userRepository.save(user);
    }
  }

  public List<User> getUsers(){
    return (List<User>) this.userRepository.findAll();
  }

  public User getByName(String name){
    return this.userRepository.findByName(name);
  }

  public boolean wrongPassword(String name, String password){
    if (this.userRepository.findByName(name).getPassword() != password){
      return  true;
    }
    return false;
  }

//  public boolean alreadyExists(String name, String password){
//    User user = this.userRepository.findByNameAndPassword(name, password);
//    if ()
//
//  }


}
