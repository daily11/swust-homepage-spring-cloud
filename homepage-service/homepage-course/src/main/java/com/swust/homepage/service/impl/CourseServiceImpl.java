package com.swust.homepage.service.impl;

import com.swust.homepage.dao.HomepageCourseMapper;
import com.swust.homepage.entity.HomepageCourse;
import com.swust.homepage.service.ICourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@Service
public class CourseServiceImpl implements ICourseService {
    private HomepageCourseMapper homepageCourseMapper;

    @Autowired
    public CourseServiceImpl(HomepageCourseMapper homepageCourseMapper) {
        this.homepageCourseMapper = homepageCourseMapper;
    }

    @Override
    public HomepageCourse getCourse(Long id) {
        return homepageCourseMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<HomepageCourse> getCourses() {
        return homepageCourseMapper.getCourses();
    }

    @Override
    public List<HomepageCourse> getCoursesByIds(Long[] ids) {
        List<Long> idsList = Arrays.asList(ids);
        List<HomepageCourse> courseList = this.getCourses();
        courseList.removeIf(arg -> !idsList.contains(arg.getId()));
        return courseList;
    }
}
