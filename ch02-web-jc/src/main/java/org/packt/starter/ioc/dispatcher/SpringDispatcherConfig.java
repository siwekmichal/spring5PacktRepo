package org.packt.starter.ioc.dispatcher;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.ResourceBundleViewResolver;

@EnableWebMvc
@ComponentScan(basePackages = "org.packt.starter.ioc")
@Configuration
public class SpringDispatcherConfig extends WebMvcConfigurerAdapter {

    @Bean
    public InternalResourceViewResolver jspViewResolver(){
        InternalResourceViewResolver viewResolverA = new InternalResourceViewResolver();
        viewResolverA.setPrefix("/WEB-INF/jsp/");
        viewResolverA.setSuffix(".jsp");
        viewResolverA.setOrder(1);
        return viewResolverA;
    }

    @Bean
    public ResourceBundleViewResolver bundleViewResolver(){
        ResourceBundleViewResolver viewResolverB = new ResourceBundleViewResolver();
        viewResolverB.setBasename("config.views");
        viewResolverB.setOrder(0);
        return viewResolverB;
    }

}
