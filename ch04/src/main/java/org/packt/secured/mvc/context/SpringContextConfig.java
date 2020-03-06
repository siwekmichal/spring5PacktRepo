package org.packt.secured.mvc.context;

//import org.packt.secured.mvc.core.AppSecurityConfig;
//import org.packt.secured.mvc.core.AppSecurityModelA;
import org.packt.secured.mvc.core.AppSecurityModelB;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.security.web.session.HttpSessionEventPublisher;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Import(value = {AppSecurityModelB.class})
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"org.packt.secured.mvc", "org.packt.secured.mvc.core.manager"})
public class SpringContextConfig {

    @Bean
    public HttpSessionEventPublisher httpSessionEventPublisher() {
        return new HttpSessionEventPublisher();
    }
}
