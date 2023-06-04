package org.ass.mus.configuration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class DispatcherServletIntilializer implements WebApplicationInitializer{

	@SuppressWarnings("resource")
	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {

		AnnotationConfigWebApplicationContext applicationContext = new AnnotationConfigWebApplicationContext();
		applicationContext.register(Appconfiguration.class);
		
		DispatcherServlet servlet = new DispatcherServlet(applicationContext);
		Dynamic dynamic = servletContext.addServlet("dispatcher", servlet);
		dynamic.addMapping("/");
		dynamic.setLoadOnStartup(1);
	}

}
