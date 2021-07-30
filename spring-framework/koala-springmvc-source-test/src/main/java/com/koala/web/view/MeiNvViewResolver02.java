package com.koala.web.view;

import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

import java.util.Locale;

/**
 * day19
 * Create by koala on 2021-07-28
 */
public class MeiNvViewResolver02 implements ViewResolver {

	@Override
	public View resolveViewName(String viewName, Locale locale) throws Exception {
		//我们只解析 meinv
		if(viewName.startsWith("meinv:")){
			return new MeiNvView01();
		}
		return null;
	}

}
