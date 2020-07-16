package com.greenfoxacademy.reddit.service;

import com.greenfoxacademy.reddit.model.Post;
import com.greenfoxacademy.reddit.repository.PostRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {

  private PostRepository postRepository;

  @Autowired
  public PostService(PostRepository postRepository) {
    this.postRepository = postRepository;
  }

  public List<Post> getPosts() {
    return (List<Post>) postRepository.findAll();
  }

  public void savePost(String title, String url) {
    this.postRepository.save(new Post(title, url));
  }

  public void addPoint(Long id) {
    Optional<Post> optionalPost = this.postRepository.findById(id);
    Integer point = optionalPost.get().getPoints();
    optionalPost.get().setPoints(point += 1);
    this.postRepository.save(optionalPost.get());
  }

  public void subtractPoint(Long id) {
    Optional<Post> optionalPost = this.postRepository.findById(id);
    Integer point = this.postRepository.findById(id).get().getPoints();
    optionalPost.get().setPoints(point -= 1);
    this.postRepository.save(optionalPost.get());
  }

}
