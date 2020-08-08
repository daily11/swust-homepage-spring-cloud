package com.swust.homepage.controller;

import com.swust.homepage.entity.vo.CODE;
import com.swust.homepage.entity.vo.Result;
import com.swust.homepage.service.ICourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
    private ICourseService iCourseService;

    @Autowired
    public CourseController(ICourseService iCourseService) {
        this.iCourseService = iCourseService;
    }

    @RequestMapping(value = "/getCourse", method = RequestMethod.POST)
    public Result getCourse(Long id) {
        return new Result(CODE.SUCCESS, iCourseService.getCourse(id), "success");
    }

    @RequestMapping(value = "/getCourses", method = RequestMethod.POST)
    public Result getCourses() {
        return new Result(CODE.SUCCESS, iCourseService.getCourses(), "success");
    }
}
