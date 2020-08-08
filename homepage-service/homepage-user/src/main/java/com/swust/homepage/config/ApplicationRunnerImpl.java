package com.swust.homepage.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;


/**
 * @Description 系统启动时 执行的方法
 */
@Slf4j
@Component
public class ApplicationRunnerImpl implements ApplicationRunner {
    private static final String TAG = "eureka-client-homepage-user";

    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.info("--->" + TAG + "启动成功！");
    }
}
