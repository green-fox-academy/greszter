package com.greenfoxacademy.reddit.service;

import com.greenfoxacademy.reddit.model.Post;
import com.greenfoxacademy.reddit.repository.PostRepository;
import java.util.List;
import java.util.stream.Collectors;
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
    Post post = this.postRepository.findById(id).get();
    Integer point = post.getPoints();
    post.setPoints(point + 1);
    this.postRepository.save(post);
  }

  public void subtractPoint(Long id) {
    Post post = this.postRepository.findById(id).get();
    Integer point = post.getPoints();
    post.setPoints(point - 1);
    this.postRepository.save(post);
  }

  public List<Post> getFirstTenInOrder(){
    return this.postRepository.findAllOrderByPoints().stream()
        .limit(10)
        .collect(Collectors.toList());
  }


}
