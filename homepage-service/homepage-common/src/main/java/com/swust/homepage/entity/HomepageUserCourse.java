package com.swust.homepage.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HomepageUserCourse implements Serializable {
    private Long id;

    private Long userId;

    private Long couseId;

    private Date createTime;

    private Date updateTime;
}