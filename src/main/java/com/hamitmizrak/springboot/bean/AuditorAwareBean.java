package com.hamitmizrak.springboot.bean;

import com.hamitmizrak.springboot.audit.AuditorAwareImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;

@Configuration
public class AuditorAwareBean {

    @Bean
    public AuditorAware auditorAwareBean(){
        return new AuditorAwareImpl();
    }
}
