package org.packt.dissect.mvc.webxml;

import javax.servlet.*;

import org.apache.catalina.filters.CorsFilter;
import org.packt.dissect.mvc.context.SpringContextConfig;
import org.packt.dissect.mvc.dispatcher.SpringDispatcherConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.HiddenHttpMethodFilter;
import org.springframework.web.multipart.support.MultipartFilter;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@ComponentScan(basePackages = "org.packt.dissect.mvc")
@Configuration
public class SpringWebInitializer implements WebApplicationInitializer {

    public void onStartup(ServletContext container) throws ServletException {
        addDispatcherContext(container);
    }

    private void addDispatcherContext(ServletContext container) {
        // Create the dispatcher servlet's Spring application context
        AnnotationConfigWebApplicationContext dispatcherContext = new AnnotationConfigWebApplicationContext();
        dispatcherContext.register(SpringDispatcherConfig.class);

        // Declare <servlet> and <servlet-mapping> for the DispatcherServlet
        ServletRegistration.Dynamic dispatcher = container.addServlet("ch03-servlet",
                new DispatcherServlet(dispatcherContext));
        dispatcher.addMapping("*.html");
        dispatcher.setLoadOnStartup(1);

        FilterRegistration.Dynamic corsFilter = container.addFilter("corsFilter", new CorsFilter());
        corsFilter.setInitParameter("cors.allowed.methods", "GET, POST, HEAD, OPTIONS, PUT, DELETE");
        corsFilter.addMappingForUrlPatterns(null, true, "/*");

        MultipartConfigElement multipartConfig = new MultipartConfigElement("/");
        dispatcher.setMultipartConfig(multipartConfig);

        FilterRegistration.Dynamic filter = container.addFilter("hiddenmethodfilter", new HiddenHttpMethodFilter());
        filter.addMappingForServletNames(null, true, "/*");

        FilterRegistration.Dynamic multipartFilter = container.addFilter("multipartFilter", new MultipartFilter());
        multipartFilter.addMappingForUrlPatterns(null, true, "/*");

    }


}
