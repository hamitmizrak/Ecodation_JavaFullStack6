package com.hamitmizrak.springboot.controller.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.PostConstruct;
import java.util.TimeZone;

//MVC
@Controller
@RequestMapping("mvc")
public class ProductMvc {

    //bean constructor
    @PostConstruct
    public void getMyLocalTimeZona(){
        TimeZone.setDefault(TimeZone.getTimeZone("IST"));
    }

    //Normal constructor
    public ProductMvc() {
    }

    // defaultta: JSON çalışır.
    // http://localhost:8080/mvc/data0
    @GetMapping("data0")
    @ResponseBody
    public String mvc0() {
        return "Merhabalar";
    }

    // http://localhost:8080/mvc/data1
    @GetMapping("data1")
    public String mvc1() {
        return "template1";
    }

    // http://localhost:8080/mvc/data2
    @GetMapping("data2")
    public String mvc2(Model model) {
        model.addAttribute("key_2","Java'dan geldim");
        return "template2";
    }

}
