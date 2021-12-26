package com.snowleopard.blog.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor

public class Users {

  private long usersId;
  private String usersName;
  private String usersPassword;
  private String usersSalt;


  public long getUsersId() {
    return usersId;
  }

  public void setUsersId(long usersId) {
    this.usersId = usersId;
  }


  public String getUsersName() {
    return usersName;
  }

  public void setUsersName(String usersName) {
    this.usersName = usersName;
  }


  public String getUsersPassword() {
    return usersPassword;
  }

  public void setUsersPassword(String usersPassword) {
    this.usersPassword = usersPassword;
  }


  public String getUsersSalt() {
    return usersSalt;
  }

  public void setUsersSalt(String usersSalt) {
    this.usersSalt = usersSalt;
  }

}
