package com.snowleopard.blog.service.Impl;

import com.snowleopard.blog.dao.UsersMapper;
import com.snowleopard.blog.entity.Users;
import com.snowleopard.blog.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Description:
 * Param:
 * return:
 * Author: 20191002864 周颖雯
 * Date: 2021/12/25
 */
@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    UsersMapper usersMapper;

    @Override
    public Users login(String usersName, String usersPassword) {
        Users users = usersMapper.login(usersName,usersPassword);
        return users;
    }

    @Override
    public Users updateUserInfo(String password, int userId) {
        return null;
    }

    @Override
    public Users selectByUserName(String usersName) {
        return usersMapper.selectByUserName(usersName);
    }
}
