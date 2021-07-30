package com.koala.web.config;

import com.koala.web.view.MeiNvViewResolver02;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * day19
 * 我的视图解析器和SpringMVC默认的都在一起
 * 容器中有 WebMvcConfigurer 类型的组件（@Component\@Configuration）就行
 * Create by koala on 2021-07-29
 */
@EnableWebMvc //启用SpringMVC功能，修改SpringMVC底层行为就会很方便只需要实现 WebMvcConfigurer 即可
@Configuration
public class MvcExtendConfiguration01 implements WebMvcConfigurer {

	@Override  //配置视图解析器，升级了这个组件的功能
	public void configureViewResolvers(ViewResolverRegistry registry) {
		registry.viewResolver(new MeiNvViewResolver02()); //判断美女
	}

}
