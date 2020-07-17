package com.greenfoxacademy.reddit.service;

import static com.greenfoxacademy.reddit.repository.PostRepository.pageWithTenElements;


import com.greenfoxacademy.reddit.model.Post;
import com.greenfoxacademy.reddit.repository.PostRepository;
import java.awt.print.PageFormat;
import java.awt.print.Pageable;
import java.awt.print.Printable;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
public class PostService implements Pageable {

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


  @Override
  public int getNumberOfPages() {
    return 0;
  }

  @Override
  public PageFormat getPageFormat(int pageIndex) throws IndexOutOfBoundsException {
    return null;
  }

  @Override
  public Printable getPrintable(int pageIndex) throws IndexOutOfBoundsException {
    return null;
  }



}
