package com.swust.homepage.client;

import com.swust.homepage.entity.HomepageCourse;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

/**
 * <h1>熔断降级</h1>
 */
@Component
public class CourseClientHystrix implements CourseClient {

    @Override
    public HomepageCourse getCourse(Long id) {
        return HomepageCourse.invalid();
    }

    @Override
    public List<HomepageCourse> getCourses() {
        return Collections.emptyList();
    }

    @Override
    public List<HomepageCourse> getCoursesByIds(List<Long> ids) {
        return Collections.emptyList();
    }
}
