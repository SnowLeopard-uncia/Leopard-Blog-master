package com.snowleopard.blog.param;

import com.sun.istack.internal.NotNull;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * Description:
 * Param:
 * return:
 * Author: 20191002864 周颖雯
 * Date: 2021/12/5
 */
@Data
//序列化接口 对象网络传输
public class UserLoginParam implements Serializable {
    @ApiModelProperty("登录名")
    @NotNull
    private String usersName;

    @ApiModelProperty("用户密码(需要MD5加密)")
    @NotNull
    private String usersPassword;

}
