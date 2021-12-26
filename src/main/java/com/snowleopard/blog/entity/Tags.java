package com.snowleopard.blog.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor

public class Tags {

  private long tagsId;
  private String tagsName;
  private long blogNum;
  private long isDeleted;


  public long getTagsId() {
    return tagsId;
  }

  public void setTagsId(long tagsId) {
    this.tagsId = tagsId;
  }


  public String getTagsName() {
    return tagsName;
  }

  public void setTagsName(String tagsName) {
    this.tagsName = tagsName;
  }


  public long getBlogNum() {
    return blogNum;
  }

  public void setBlogNum(long blogNum) {
    this.blogNum = blogNum;
  }


  public long getIsDeleted() {
    return isDeleted;
  }

  public void setIsDeleted(long isDeleted) {
    this.isDeleted = isDeleted;
  }

}
