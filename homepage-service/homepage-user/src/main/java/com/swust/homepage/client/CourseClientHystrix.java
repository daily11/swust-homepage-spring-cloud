package com.swust.homepage.client;

import com.swust.homepage.entity.HomepageCourse;
import com.swust.homepage.entity.vo.CODE;
import com.swust.homepage.entity.vo.Result;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
    public Result getCoursesByIds(@RequestBody Long[] ids) {
        return new Result(CODE.SUCCESS, Collections.emptyList(), "success");
    }
}
