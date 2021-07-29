package com.koala.web.view;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

import java.util.Locale;

/**
 * Create by koala on 2021-07-28
 */
@Order //SpringBoot整合的时候，自定义视图解析器需要指定好顺序
@Component
public class MeiNvViewResolver01 implements ViewResolver {

	@Override
	public View resolveViewName(String viewName, Locale locale) throws Exception {
		//我们只解析 meinv
		if(viewName.startsWith("meinv:")){
			return new MeiNvView01();
		}
		return null;
	}

}
