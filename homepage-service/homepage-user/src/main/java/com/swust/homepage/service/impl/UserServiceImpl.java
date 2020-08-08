package com.swust.homepage.service.impl;

import com.swust.homepage.client.CourseClient;
import com.swust.homepage.dao.HomepageUserCourseMapper;
import com.swust.homepage.dao.HomepageUserMapper;
import com.swust.homepage.entity.HomepageCourse;
import com.swust.homepage.entity.HomepageUser;
import com.swust.homepage.entity.HomepageUserCourse;
import com.swust.homepage.entity.vo.UserCourseVO;
import com.swust.homepage.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements IUserService {
    private HomepageUserMapper homepageUserMapper;
    private HomepageUserCourseMapper homepageUserCourseMapper;
    private CourseClient courseClient;

    @Autowired
    public UserServiceImpl(
            HomepageUserMapper homepageUserMapper,
            HomepageUserCourseMapper homepageUserCourseMapper,
            CourseClient courseClient
    ) {
        this.homepageUserMapper = homepageUserMapper;
        this.homepageUserCourseMapper = homepageUserCourseMapper;
        this.courseClient = courseClient;
    }

    @Override
    public HomepageUser getUser(Long id) {
        return homepageUserMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<HomepageUser> getUsers() {
        return homepageUserMapper.getUsers();
    }

    @Override
    public UserCourseVO getUserCourses(Long userId) {
        // 1 查询用户信息
        HomepageUser user = this.getUser(userId);
        if (user == null) {
            return UserCourseVO.invalid();
        }

        // 2 查询用户课程信息ID集合
        List<HomepageUserCourse> userCourseList = homepageUserCourseMapper.getCoursesByUserId(userId);
        if (CollectionUtils.isEmpty(userCourseList)) {
            return UserCourseVO.invalid();
        }

        // 3 查询用户课程信息
        List<Long> ids = userCourseList
                .stream()
                .map(HomepageUserCourse::getCouseId)
                .collect(Collectors.toList());
        List<HomepageCourse> courseList = courseClient.getCoursesByIds(ids);

        // 4 组装返回用户课程信息
        UserCourseVO userCourseVO = UserCourseVO
                .builder()
                .homepageUser(user)
                .homepageCourseList(courseList)
                .build();

        return userCourseVO;
    }
}
