package com.swust.homepage.dao;

import com.swust.homepage.entity.HomepageCourse;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HomepageCourseMapper {
    /**
     * 删除课程信息
     *
     * @param id 课程ID
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 插入课程信息
     *
     * @param record 课程实例
     */
    int insertSelective(HomepageCourse record);

    /**
     * 查询课程信息
     *
     * @param id 课程ID
     */
    HomepageCourse selectByPrimaryKey(Long id);

    /**
     * 更新课程信息
     *
     * @param record 课程实例
     */
    int updateByPrimaryKeySelective(HomepageCourse record);

    /**
     * 获取课程信息
     */
    List<HomepageCourse> getCourses();
}