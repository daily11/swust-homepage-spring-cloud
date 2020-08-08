package com.swust.homepage.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HomepageCourse {
    private Long id;

    private String couseName;

    private String couseType;

    private String couseIcon;

    private String couseIntro;

    private Date createTime;

    private Date updateTime;

    public static HomepageCourse invalid() {
        return new HomepageCourse(-1L, "", "", "", "", null, null);
    }
}