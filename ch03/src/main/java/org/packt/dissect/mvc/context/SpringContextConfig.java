package org.packt.dissect.mvc.context;


import org.packt.dissect.mvc.validator.EmployeeValidator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"org.packt.dissect.mvc", "org.packt.dissect.mvc.controller", "org.packt.dissect.mvc.validator", "org.packt.dissect.mvc.model.data"})
public class SpringContextConfig {

    @Bean
    public LocalValidatorFactoryBean validator(){
        return new LocalValidatorFactoryBean();
    }

    @Bean
    public EmployeeValidator employeeValidator(){
        return new EmployeeValidator();
    }
}
