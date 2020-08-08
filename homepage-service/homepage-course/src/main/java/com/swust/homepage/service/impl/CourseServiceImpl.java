package com.swust.homepage.service.impl;

import com.swust.homepage.dao.HomepageCourseMapper;
import com.swust.homepage.entity.HomepageCourse;
import com.swust.homepage.service.ICourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
