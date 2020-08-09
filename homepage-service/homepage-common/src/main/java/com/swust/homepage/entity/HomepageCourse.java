package com.swust.homepage.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class HomepageCourse implements Serializable {
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