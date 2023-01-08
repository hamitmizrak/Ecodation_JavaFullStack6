package com.hamitmizrak.springboot.controller.mvc;
import com.hamitmizrak.springboot.business.dto.ProductDto;
import org.springframework.ui.Model;

public interface IProduct {


    //CREATE
    //http://localhost:8080/product/create
    String  createGet(Model model);
    String  createPost(ProductDto productDto, Model model);
}
