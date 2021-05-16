package com.ssm.config;

import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

/** @Author: QTX @Date: 2021/5/15 */
@Configuration
@ComponentScan(
    value = "com.ssm",
    excludeFilters = {
      @ComponentScan.Filter(
          type = FilterType.ANNOTATION,
          value = {RestController.class, Controller.class})
    })
@EnableAspectJAutoProxy
@Import({MybatisConfig.class, WebConfig.class})
public class RootConfig {}
