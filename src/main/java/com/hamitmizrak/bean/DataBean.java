package com.hamitmizrak.bean;

import com.hamitmizrak.business.dto.RegisterDto;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataBean {

    @Bean
    public RegisterDto productDto(){
        return RegisterDto
                .builder()
                .id(1L)
                .name("computer")
                .build();
    }

    public static void main(String[] args) {
        DataBean dataBean=new DataBean();
        System.out.println(dataBean.productDto());
    }
}
