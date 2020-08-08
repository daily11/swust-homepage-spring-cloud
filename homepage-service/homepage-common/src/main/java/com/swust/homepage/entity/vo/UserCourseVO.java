package com.swust.homepage.entity.vo;

import com.swust.homepage.entity.HomepageCourse;
import com.swust.homepage.entity.HomepageUser;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collections;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserCourseVO {
    private HomepageUser homepageUser;

    private List<HomepageCourse> homepageCourseList;

    public static UserCourseVO invalid() {
        return UserCourseVO.builder()
                .homepageUser(HomepageUser.invalid())
                .homepageCourseList(Collections.emptyList())
                .build();
    }
}
