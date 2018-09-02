package com.test.springweb.app.init;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.test.springweb.app.config.AppConfig;
import com.test.springweb.app.config.HibernateConfig;
import com.test.springweb.app.config.WebConfig;

public class SpringWebAppInit  extends AbstractAnnotationConfigDispatcherServletInitializer {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	protected Class[] getRootConfigClasses() {
		return new Class[] { AppConfig.class,HibernateConfig.class };
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	protected Class[] getServletConfigClasses() {
		return new Class[] { WebConfig.class };
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}
}