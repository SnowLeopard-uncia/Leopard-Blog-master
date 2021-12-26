package com.snowleopard.blog.common;

/**
 * Description:
 * Param:
 * return:
 * Author: 20191002864 周颖雯
 * Date: 2021/12/3
 */
public enum ServiceResultEnum {
    ERROR("error"),

    SUCCESS("success"),

    USER_LOGIN_SUCCESS("用户登录成功"),

    ADMIN_LOGIN_SUCCESS("管理员登录成功"),

    LOGIN_ERROR("登录错误"),

    REGISTER_SUCCESS("注册成功"),

    REGISTER_ERROR("注册错误"),

    USER_DOES_NOT_EXIT("用户不存在"),

    USER_DOES_EXIT("用户已存在"),

    PASSWORD_MISTAKE("密码错误"),

    TOKEN_EXPIRE("token过期"),

    TOKEN_NOT_FOUND("无效token"),

    USER_NOT_LOGIN("用户未登录"),

    DATA_NOT_EXIST("未查询到记录！");

    private String result;

    ServiceResultEnum(String result) {
        this.result = result;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
