package com.hamitmizrak.controller.api;


import com.hamitmizrak.bean.ModelMapperBean;
import com.hamitmizrak.data.entity.RegisterEntity;
import com.hamitmizrak.data.repository.IRegisterRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//Lombok
@RequiredArgsConstructor
@Log4j2

@RestController
@RequestMapping("api_v1_register")
public class RegisterApi {


    //Injection
    private final IRegisterRepository iRegisterRepository;
    private final ModelMapperBean modelMapperBean;


    //Speed
    //http://localhost:8080/api_v1_register/speed
    @GetMapping("speedasd")
    public RegisterEntity createApiSpeed() {
        RegisterEntity registerEntity = null;
        for (int i = 1; i <= 5; i++) {
             registerEntity = RegisterEntity.builder()
                    .name("adi " + i).surname("surname " + i).password("password " + i).email("email" + i + "@gmail.com")
                    .build();
            iRegisterRepository.save(registerEntity);
        }
        return registerEntity;
    }

    //LIST
    //http://localhost:8080/api_v1_register/list/register
    @GetMapping("list/register")
    public List<RegisterEntity>  getApiAllDataList() {
        List<RegisterEntity> productEntityList = iRegisterRepository.findAll();
        return productEntityList;
    }

}
