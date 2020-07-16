package com.greenfoxacademy.reddit.service;

import com.greenfoxacademy.reddit.model.Post;
import com.greenfoxacademy.reddit.repository.PostRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {

  private PostRepository postRepository;

  @Autowired
  public PostService(PostRepository postRepository) {
    this.postRepository = postRepository;
  }

  public List<Post> getPosts(){
    return (List<Post>) postRepository.findAll();
  }

  public void savePost(String title, String url){
    this.postRepository.save(new Post(title, url));
  }

//  public List<Post> getPoints(){
//    return this.postRepository.findAllByPointsAndOrderByPointsIdDesc();
//  }

}
