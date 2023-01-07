package com.hamitmizrak.springboot.controller.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//MVC
@Controller
@RequestMapping("mvc")
public class ProductMvc {

    // defaultta: JSON çalışır.
    // http://localhost:8080/mvc/data1
    @GetMapping("data1")
    @ResponseBody
    public String mvc() {
        return "Merhabalar";
    }

}
