package com.koala.web.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * day03：Spring不扫描controller组件、AOP咋实现的....
 * Create by koala on 2021-07-25
 */
@ComponentScan(value = "com.koala.web",excludeFilters = {
		@ComponentScan.Filter(type= FilterType.ANNOTATION,value = Controller.class)
})
@Configuration
public class SpringConfig01 {
	//day03：Spring的父容器
}
