package com.snowleopard.blog.service;

import com.snowleopard.blog.entity.Users;

/**
 * Description:
 * Param:
 * return:
 * Author: 20191002864 周颖雯
 * Date: 2021/12/25
 */
public interface UsersService {
    Users login(String usersName, String usersPassword);

    Users updateUserInfo(String password,int userId);


    Users selectByUserName(String usersName);
}
