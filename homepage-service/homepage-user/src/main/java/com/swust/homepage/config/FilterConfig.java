package com.swust.homepage.config;

import com.swust.homepage.filter.UserFilter;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class FilterConfig implements WebMvcConfigurer {
    /**
     * 自定义拦截规则
     * <p>
     * 可以添加多个拦截器，先添加的拦截器优先执行
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // addPathPatterns - 用于添加拦截规则
        // excludePathPatterns - 用户排除拦截
        registry.addInterceptor(new UserFilter())
                .addPathPatterns("/**");
    }

}
