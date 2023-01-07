package com.hamitmizrak.springboot.bean;

import com.hamitmizrak.springboot.business.dto.ProductDto;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataBean {

    @Bean
    public ProductDto productDto(){
        return ProductDto
                .builder()
                .id(1L)
                .name("computer")
                .price("35.000")
                .build();
    }

    public static void main(String[] args) {
        DataBean dataBean=new DataBean();
        System.out.println(dataBean.productDto());
    }
}
