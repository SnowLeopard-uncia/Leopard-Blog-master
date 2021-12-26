package com.snowleopard.blog.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Blogs {

  private long blogsId;
  private String blogsTitle;
  private String blogsDescription;
  private long isDeleted;
  private long isPost;
  private long draft;
  private java.sql.Timestamp createTime;

  public Blogs(String blogsTitle, String blogsDescription, long isDeleted, long isPost, long draft, Timestamp createTime) {
    this.blogsTitle = blogsTitle;
    this.blogsDescription = blogsDescription;
    this.isDeleted = isDeleted;
    this.isPost = isPost;
    this.draft = draft;
    this.createTime = createTime;
  }
}
