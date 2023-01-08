package com.hamitmizrak.springboot.controller.mvc;

import com.hamitmizrak.springboot.bean.ModelMapperBean;
import com.hamitmizrak.springboot.business.dto.ProductDto;
import com.hamitmizrak.springboot.data.entity.ProductEntity;
import com.hamitmizrak.springboot.data.repository.IProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

//Lombok
@RequiredArgsConstructor

@Controller
@RequestMapping("product")
public class ProductController implements IProduct{

    //Injection
    private final IProductRepository iProductRepository;
    private final ModelMapperBean modelMapperBean;

    //CREATE
    //http://localhost:8080/product/create
    @GetMapping("create")
    @Override
    public String  createGet(Model model){
        model.addAttribute("product_create",new ProductDto());
        return "product_list";
    }

    //http://localhost:8080/product/create
    @PostMapping("create")
    @Override
    public String  createPost(@Valid @ModelAttribute("product_create") ProductDto productDto, Model model){
        ProductEntity productEntity= modelMapperBean.modelMapperMethod().map(productDto, ProductEntity.class);
        iProductRepository.save(productEntity);
        return "product_list";
    }

}
