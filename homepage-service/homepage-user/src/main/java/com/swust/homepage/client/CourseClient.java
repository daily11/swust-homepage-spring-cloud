package com.swust.homepage.client;

import com.swust.homepage.entity.HomepageCourse;
import com.swust.homepage.entity.vo.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * <h1>通过 Feign 访问课程微服务</h1>
 */
@FeignClient(value = "eureka-client-homepage-course", fallback = CourseClientHystrix.class)
@Component
public interface CourseClient {

    @RequestMapping(value = "/homepage-course/getCourse", method = RequestMethod.POST)
    HomepageCourse getCourse(Long id);

    @RequestMapping(value = "/homepage-course/getCourses", method = RequestMethod.POST)
    List<HomepageCourse> getCourses();

    @RequestMapping(value = "/homepage-course/getCoursesByIds", method = RequestMethod.POST)
    Result getCoursesByIds(@RequestBody Long[] ids);
}
