package com.koala.web;

import com.koala.web.config.SpringConfig01;
import com.koala.web.config.SpringMVCConfig01;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.ServletRegistration;

/**
 * day03：最快速的整合注解版SpringMVC和Spring的
 * Create by koala on 2021-07-25
 */
public class QuickAppStarter01 extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override //day03：根容器的配置（Spring的配置文件===Spring的配置类）
	protected Class<?>[] getRootConfigClasses() {
		return new Class<?>[]{SpringConfig01.class};
	}

	@Override //day03：web容器的配置（SpringMVC的配置文件===SpringMVC的配置类）
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[]{SpringMVCConfig01.class};
	}

	@Override //day03：Servlet的映射，DispatcherServlet的映射路径
	protected String[] getServletMappings() {
		return new String[]{"/"};
	}

	@Override
	protected void customizeRegistration(ServletRegistration.Dynamic registration) {
		/*super.customizeRegistration(registration);

		registration.addMapping("");*/
	}

}
