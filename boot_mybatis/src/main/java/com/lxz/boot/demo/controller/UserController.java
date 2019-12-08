package com.lxz.boot.demo.controller;

import com.lxz.boot.demo.dao.UserDao;
import com.lxz.boot.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zsw on 2019/12/06
 */
@RestController
public class UserController {

    @Autowired
    private UserDao userDao;

    @RequestMapping("/getuser")
    public String getUser(){
        User byId = userDao.getById(1L);
        String user = byId.toString();
        return user;
    }
}
