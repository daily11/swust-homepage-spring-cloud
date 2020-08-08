package com.swust.homepage.service;

import com.swust.homepage.entity.HomepageUser;
import com.swust.homepage.entity.vo.UserCourseVO;

import java.util.List;

public interface IUserService {
    /**
     * 获取用户信息
     *
     * @param id 用户ID
     */
    HomepageUser getUser(Long id);

    /**
     * 获取用户信息
     */
    List<HomepageUser> getUsers();

    /**
     * 获取用户课程信息
     *
     * @param userId 用户ID
     */
    UserCourseVO getUserCourses(Long userId);
}
