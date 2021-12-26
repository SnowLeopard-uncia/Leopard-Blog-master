package com.snowleopard.blog.common;

/**
 * Description:
 * Param:
 * return:
 * Author: 周颖雯
 * Date: 2021/12/25
 */

/**
 * 封装状态码
 */
public enum StatusCodeEnum {

    //http定义好的状态码
    SUCCESS(200),

    SERVER_ERROR(500),

    URL_NOT_FOUND(404),

    //自定义  状态码

    TOKEN_EXPIRE(401),

    TOKEN_NOT_FOUND(401),

    USER_NOT_LOGIN(1002),

    USER_DOES_NOT_EXIT(1003);


    public int code;

    StatusCodeEnum(int code) {
        this.code = code;
    }
}
