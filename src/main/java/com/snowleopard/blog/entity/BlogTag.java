package com.snowleopard.blog.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor

public class BlogTag {

  private long blogTagId;
  private long blogsId;
  private long tagsId;


  public long getBlogTagId() {
    return blogTagId;
  }

  public void setBlogTagId(long blogTagId) {
    this.blogTagId = blogTagId;
  }


  public long getBlogsId() {
    return blogsId;
  }

  public void setBlogsId(long blogsId) {
    this.blogsId = blogsId;
  }


  public long getTagsId() {
    return tagsId;
  }

  public void setTagsId(long tagsId) {
    this.tagsId = tagsId;
  }

}
