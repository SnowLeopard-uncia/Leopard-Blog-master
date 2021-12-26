package com.snowleopard.blog.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@AllArgsConstructor
@NoArgsConstructor

public class Feedback {

  private long feedbackId;
  private String feedbackContent;
  private long feedbackShow;
  private java.sql.Timestamp feedbackTime;

  public Feedback(String feedbackContent, long feedbackShow, Timestamp feedbackTime) {
    this.feedbackContent = feedbackContent;
    this.feedbackShow = feedbackShow;
    this.feedbackTime = feedbackTime;
  }

  public long getFeedbackId() {
    return feedbackId;
  }

  public void setFeedbackId(long feedbackId) {
    this.feedbackId = feedbackId;
  }


  public String getFeedbackContent() {
    return feedbackContent;
  }

  public void setFeedbackContent(String feedbackContent) {
    this.feedbackContent = feedbackContent;
  }


  public long getFeedbackShow() {
    return feedbackShow;
  }

  public void setFeedbackShow(long feedbackShow) {
    this.feedbackShow = feedbackShow;
  }


  public java.sql.Timestamp getFeedbackTime() {
    return feedbackTime;
  }

  public void setFeedbackTime(java.sql.Timestamp feedbackTime) {
    this.feedbackTime = feedbackTime;
  }

}
