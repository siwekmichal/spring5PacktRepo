package org.packt.secured.mvc.webxml;

import org.packt.secured.mvc.context.SpringContextConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

@EnableWebMvc
@ComponentScan(basePackages = "org.packt.secured.mvc")
@Configuration
public class SpringWebInitializer implements WebApplicationInitializer {
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        addRootContext(servletContext);
        addDispatcherContext(servletContext);
    }

    private void addRootContext(ServletContext container){
        AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
        rootContext.register(SpringContextConfig.class);

        container.addListener(new ContextLoaderListener(rootContext));
    }

    private void addDispatcherContext(ServletContext containter){
        AnnotationConfigWebApplicationContext dispatcherContext = new AnnotationConfigWebApplicationContext();
        dispatcherContext.register(SpringContextConfig.class);

        // Declare <servlet> and <servlet-mapping> for DispatcherServlet
        ServletRegistration.Dynamic dispatcher = containter.addServlet("ch04-servlet",
                new DispatcherServlet(dispatcherContext));
        dispatcher.addMapping("*.html");
        dispatcher.setLoadOnStartup(1);
    }



}
