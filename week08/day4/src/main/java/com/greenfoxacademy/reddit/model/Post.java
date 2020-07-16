package com.greenfoxacademy.reddit.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Post {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String url;
  private String title;
  private Integer points;

  public Post(String title, String url) {
    this.url = url;
    this.title = title;
    points = 0;
  }

  public void setPoints(Integer points) {
    this.points = points;
  }

  public Integer getPoints() {
    return points;
  }

}
