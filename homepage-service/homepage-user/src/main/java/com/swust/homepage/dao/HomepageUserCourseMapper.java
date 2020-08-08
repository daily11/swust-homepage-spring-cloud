package com.swust.homepage.dao;

import com.swust.homepage.entity.HomepageCourse;
import com.swust.homepage.entity.HomepageUserCourse;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HomepageUserCourseMapper {

    /**
     * 删除用户课程信息
     *
     * @param id 用户课程ID
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 插入用户课程信息
     *
     * @param record 用户课程实例
     */
    int insertSelective(HomepageUserCourse record);

    /**
     * 查询用户课程信息
     *
     * @param id 用户课程ID
     */
    HomepageUserCourse selectByPrimaryKey(Long id);

    /**
     * 更新用户课程信息
     *
     * @param record 用户课程实例
     */
    int updateByPrimaryKeySelective(HomepageUserCourse record);

    /**
     * 查询用户课程信息
     *
     * @param userId
     */
    List<HomepageUserCourse> getCoursesByUserId(Long userId);
}