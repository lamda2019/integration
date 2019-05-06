package com.wsc.controller;

import com.wsc.common.UserBean;
import com.wsc.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user/*")
public class UserController {

    @Autowired
    UserService userService;
    /*
    * http://localhost:8081/user/list
    *
    * */
    @GetMapping("list")
    public UserBean list() {
        try {
            return UserBean.isOk().data(userService.list());
        } catch (Exception e) {
            return UserBean.isFail(e);
        }

    }

}