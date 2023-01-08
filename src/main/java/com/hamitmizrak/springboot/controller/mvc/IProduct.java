package com.hamitmizrak.springboot.controller.mvc;
import com.hamitmizrak.springboot.business.dto.ProductDto;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

public interface IProduct {


    //CREATE
    //http://localhost:8080/product/create
    String  createGet(Model model);

    //http://localhost:8080/product/create
    String  createPost(ProductDto productDto, BindingResult bindingResult, Model model);

    //LIST
    //http://localhost:8080/product/list
    String getAllDataList(Model model);

    //FIND
    //http://localhost:8080/product/find/1
    String getFindList(Long id, Model model);

    //DELETE
    String getDelete( Long id, Model model);

    //UPDATE
    //http://localhost:8080/product/update
    String  updateGet( Long id, Model model);

    //http://localhost:8080/product/update
    String  updatePost( ProductDto productDto, BindingResult bindingResult, Model model);
}
