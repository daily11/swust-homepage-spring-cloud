package com.swust.homepage.controller;

import com.swust.homepage.entity.vo.CODE;
import com.swust.homepage.entity.vo.Result;
import com.swust.homepage.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private IUserService iUserService;

    @Autowired
    public UserController(IUserService iUserService) {
        this.iUserService = iUserService;
    }

    @RequestMapping(value = "/getUser", method = RequestMethod.POST)
    public Result getUser(Long id) {
        return new Result(CODE.SUCCESS, iUserService.getUser(id), "success");
    }

    @RequestMapping(value = "/getUsers", method = RequestMethod.POST)
    public Result getUsers() {
        return new Result(CODE.SUCCESS, iUserService.getUsers(), "success");
    }

    @RequestMapping(value = "/getUserCourses", method = RequestMethod.POST)
    public Result getUserCourses(Long userId) {
        return new Result(CODE.SUCCESS, iUserService.getUserCourses(userId), "success");
    }

}
