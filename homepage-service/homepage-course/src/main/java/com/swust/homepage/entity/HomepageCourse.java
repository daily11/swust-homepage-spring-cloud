package com.swust.homepage.entity;

import java.util.Date;

public class HomepageCourse {
    private Long id;

    private String couseName;

    private String couseType;

    private String couseIcon;

    private String couseIntro;

    private Date createTime;

    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCouseName() {
        return couseName;
    }

    public void setCouseName(String couseName) {
        this.couseName = couseName == null ? null : couseName.trim();
    }

    public String getCouseType() {
        return couseType;
    }

    public void setCouseType(String couseType) {
        this.couseType = couseType == null ? null : couseType.trim();
    }

    public String getCouseIcon() {
        return couseIcon;
    }

    public void setCouseIcon(String couseIcon) {
        this.couseIcon = couseIcon == null ? null : couseIcon.trim();
    }

    public String getCouseIntro() {
        return couseIntro;
    }

    public void setCouseIntro(String couseIntro) {
        this.couseIntro = couseIntro == null ? null : couseIntro.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}