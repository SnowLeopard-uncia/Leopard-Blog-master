package com.snowleopard.blog.dao;

import com.snowleopard.blog.entity.Users;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * Description:
 * Param:
 * return:
 * Author: 20191002864 周颖雯
 * Date: 2021/12/25
 */
@Mapper
@Repository
public interface UsersMapper {

    Users login(@Param("usersName") String usersName, @Param("usersPassword") String usersPassword);


    Users selectByUserName(@Param("usersName") String usersName);


    Users selectByUserId(@Param("usersId") int usersId);


    int updateUserByUserNameSelective(Users updateInfo);


}
