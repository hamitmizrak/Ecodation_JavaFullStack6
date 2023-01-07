package com.hamitmizrak.springboot.controller.mvc;

import com.hamitmizrak.springboot.business.dto.ProductDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;

//MVC
@Controller
@RequestMapping("mvc")
public class ProductMvc {

    //bean constructor
    @PostConstruct
    public void getMyLocalTimeZona() {
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
        model.addAttribute("key_2", "Java'dan geldim");
        return "template2";
    }

    // http://localhost:8080/mvc/data3
    @GetMapping("data3")
    public String mvc3(Model model) {
        ProductDto productDto = ProductDto
                .builder()
                .id(44L)
                .name("name 3")
                .price("price 3")
                .build();
        model.addAttribute("key_3", productDto);
        return "template3";
    }


    // http://localhost:8080/mvc/data4
    @GetMapping("data4")
    public String mvc4(Model model) {
        List<ProductDto> productList = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            productList.add(ProductDto
                    .builder()
                    .id(44L)
                    .name("name " + i)
                    .price("price " + i)
                    .build());
        }
        model.addAttribute("key_4", productList);
        return "template4";
    }


    // http://localhost:8080/mvc/data5/4
    @GetMapping("data5/{id}")
    public String mvc5(@PathVariable("id") Long id, Model model) {
        ProductDto productDto = ProductDto
                .builder()
                .id(id)
                .name("name 3")
                .price("price 3")
                .build();
        model.addAttribute("key_5", productDto);
        return "template5";
    }

    // http://localhost:8080/mvc/data6
    // http://localhost:8080/mvc/data6/4
    @GetMapping({"data6","data6/{id}"})
    public String mvc6(@PathVariable(value = "id",required = false) Long id, Model model) {
        if(id!=null){
            ProductDto productDto = ProductDto
                    .builder()
                    .id(id)
                    .name("name 3")
                    .price("price 3")
                    .build();
            model.addAttribute("key_6", productDto);
        }else{
            model.addAttribute("key_6", "id null veya yazılmadı");
        }
        return "template6";
    }

    //request param
    // http://localhost:8080/mvc/data7
    // http://localhost:8080/mvc/data7?id=4
    @GetMapping("data7")
    public String mvc7(@RequestParam(value = "id",required = false) Long id, Model model) {
        if(id!=null){
            ProductDto productDto = ProductDto
                    .builder()
                    .id(id)
                    .name("name 3")
                    .price("price 3")
                    .build();
            model.addAttribute("key_7", productDto);
        }else{
            model.addAttribute("key_7", "id null veya yazılmadı");
        }
        return "template7";
    }



    // http://localhost:8080/mvc/data8/4?name=data
    @GetMapping("data8/{id}")
    public String mvc8(
            @PathVariable(value = "id") Long id,
            @RequestParam(value = "name") String name,
            Model model) {
        if(id!=null){
            ProductDto productDto = ProductDto
                    .builder()
                    .id(id)
                    .name(name)
                    .price("price 3")
                    .build();
            model.addAttribute("key_8", productDto);
        }else{
            model.addAttribute("key_8", "id null veya yazılmadı");
        }
        return "template8";
    }

}
