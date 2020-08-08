package com.swust.homepage.service;

import com.swust.homepage.entity.HomepageCourse;

import java.util.List;

public interface ICourseService {

    /**
     * 获取课程信息
     *
     * @param id 课程ID
     */
    HomepageCourse getCourse(Long id);

    /**
     * 获取课程信息
     */
    List<HomepageCourse> getCourses();

    /**
     * 获取课程信息
     *
     * @param ids 课程 ID 集合
     */
    List<HomepageCourse> getCoursesByIds(List<Long> ids);
}
