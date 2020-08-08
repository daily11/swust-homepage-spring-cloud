package com.swust.homepage.entity;

import lombok.Data;

import java.util.Date;

@Data
public class HomepageUserCourse {
    private Long id;

    private Long userId;

    private Long couseId;

    private Date createTime;

    private Date updateTime;
}