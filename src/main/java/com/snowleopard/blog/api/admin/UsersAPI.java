package com.snowleopard.blog.api.admin;

import com.snowleopard.blog.common.ServiceResultEnum;
import com.snowleopard.blog.entity.Users;
import com.snowleopard.blog.param.UserLoginParam;
import com.snowleopard.blog.service.UsersService;
import com.snowleopard.blog.util.Result;
import com.snowleopard.blog.util.ResultGenerator;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * Description:
 * Param:
 * return:
 * Author: 20191002864 周颖雯
 * Date: 2021/12/25
 */
@RestController
@Api(value = "v1", tags = "1-1 管理员相关接口")
@RequestMapping("manage-api/v1")
public class UsersAPI {
    @Autowired
    private UsersService usersService;

    @CrossOrigin
    @PostMapping("/admin/login")
    @ApiOperation(value = "登录接口")
    public Result login(@RequestHeader("application/json") @RequestBody @Validated UserLoginParam userLoginParam) {
        Users users = usersService.selectByUserName(userLoginParam.getUsersName());
        if (users != null) {
                try {
                    Users loginResult = usersService.login(userLoginParam.getUsersName(),userLoginParam.getUsersPassword());

                    if (loginResult!=null) {

                        return ResultGenerator.genSuccessResult(ServiceResultEnum.USER_LOGIN_SUCCESS.getResult(), loginResult);
                    } else {
                        return ResultGenerator.genFailResult(ServiceResultEnum.PASSWORD_MISTAKE.getResult(),userLoginParam);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    return ResultGenerator.genFailResult("数据库访问错误");
                }
            }
         else {
            return ResultGenerator.genFailResult(ServiceResultEnum.USER_DOES_NOT_EXIT.getResult());
        }
    }
}
