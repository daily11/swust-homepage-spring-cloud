package com.swust.homepage.dao;

import com.swust.homepage.entity.HomepageUser;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HomepageUserMapper {
    /**
     * 删除用户信息
     *
     * @param id 用户ID
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 插入用户信息
     *
     * @param record 用户实例
     */
    int insertSelective(HomepageUser record);

    /**
     * 查询用户信息
     *
     * @param id 用户ID
     */
    HomepageUser selectByPrimaryKey(Long id);

    /**
     * 更新用户信息
     *
     * @param record 用户实例
     */
    int updateByPrimaryKeySelective(HomepageUser record);

    /**
     * 获取用户信息
     */
    List<HomepageUser> getUsers();
}