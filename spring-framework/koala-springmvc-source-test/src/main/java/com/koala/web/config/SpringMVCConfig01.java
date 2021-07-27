package com.koala.web.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * day03：SpringMVC只扫描Controller组件，可以不指定父容器类，让MVC扫所有。@Component+@RequestMapping就生效了
 * Create by koala on 2021-07-25
 */
@ComponentScan(value = "com.koala.web",includeFilters = {
		@ComponentScan.Filter(type= FilterType.ANNOTATION,value = Controller.class)
},useDefaultFilters = false)
public class SpringMVCConfig01 {
	//day03：SpringMVC的子容器，能扫描的Spring容器中的组件
}
