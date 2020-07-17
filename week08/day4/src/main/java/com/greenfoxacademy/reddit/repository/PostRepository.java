package com.greenfoxacademy.reddit.repository;

import com.greenfoxacademy.reddit.model.Post;
import java.util.List;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends PagingAndSortingRepository<Post, Long> {
  @Query ("select p from Post p order by p.points desc")
  List<Post> findAllOrderByPoints();

  Pageable pageWithTenElements = PageRequest.of(0, 10);
}
