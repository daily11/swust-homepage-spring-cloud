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
public class HomepageUser implements Serializable {
    private Long id;

    private String username;

    private String email;

    private Date createTime;

    private Date updateTime;

    public static HomepageUser invalid() {
        return HomepageUser.builder()
                .id(-1L)
                .username("")
                .email("")
                .build();
    }
}