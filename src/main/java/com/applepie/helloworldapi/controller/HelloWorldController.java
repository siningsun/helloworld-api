package com.applepie.helloworldapi.controller;

import com.applepie.helloworldapi.mapper.UserMapper;
import com.applepie.helloworldapi.model.User;
import com.applepie.helloworldapi.response.CustomResponse;
import com.applepie.helloworldapi.response.ResultUtil;
import jakarta.annotation.Resource;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HelloWorldController {
    @Resource
    UserMapper userMapper;

    @GetMapping("login")
    public CustomResponse helloWorld(@RequestParam String username, @RequestParam String password) {
        if ( username == null || password == null || StringUtils.isEmpty(username) || StringUtils.isEmpty(password)) {
            return ResultUtil.error("failed", "please provide username and password");
        }
        User userByName = userMapper.getUserByName(username, password);
        if (userByName == null) {
            return ResultUtil.error("failed", "user not found");
        }
        return ResultUtil.success(200, "ok", "hello, " + username);
    }
}
