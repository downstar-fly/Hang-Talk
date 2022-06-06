package com.hangtalk.webapi.controller;

import com.hangtalk.webapi.DO.RegisterUserDO;
import com.hangtalk.webapi.entry.User;
import com.hangtalk.webapi.service.UserService;
import com.hangtalk.webapi.utils.ResponseResult;
import com.hangtalk.webapi.utils.ResponseUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
@Api(value = "/", tags = {"用户信息"})
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation("根据用户名&密码获取用户信息")
    @PostMapping("/userInfo")
    public ResponseResult<User> getUserByPassword(@ApiParam(required = true) @RequestParam String username,
                                                  @ApiParam(required = true) @RequestParam String password) {
        ResponseResult<User> result = new ResponseResult<>();
        User user = userService.getUserByPassword(username, password);
        result = ResponseUtil.success(user);
        return result;
    }

    @ApiOperation("注册")
    @PostMapping("/register")
    public ResponseResult<Boolean> register(@ApiParam(required = true) @RequestBody RegisterUserDO userDO) {
        ResponseResult<Boolean> result = new ResponseResult<>();
        if (ObjectUtils.isEmpty(userDO.getUsername()) || ObjectUtils.isEmpty(userDO.getPassword())) {
            result.setErrorMessage("用户名或密码不能为null");
        } else {
            Boolean res = userService.registerUser(userDO);
            result.setData(res);
        }

        return result;
    }
}
