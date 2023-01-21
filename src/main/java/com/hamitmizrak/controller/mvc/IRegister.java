package com.hamitmizrak.controller.mvc;
import com.hamitmizrak.business.dto.RegisterDto;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

public interface IRegister {

    //Speed
    //http://localhost:8080/product/speed
    String  createSpeed(Model model);

    //LIST
    //http://localhost:8080/product/list
    String getAllDataList(Model model);

    //CREATE
    //http://localhost:8080/product/create
    String  createGet(Model model);

    //http://localhost:8080/product/create
    String  createPost(RegisterDto productDto, BindingResult bindingResult, Model model);

    //FIND
    //http://localhost:8080/product/find/1
    String getFindList(Long id, Model model);

    //DELETE
    String getDelete( Long id, Model model);

    //UPDATE
    //http://localhost:8080/product/update
    String  updateGet( Long id, Model model);

    //http://localhost:8080/product/update
    String  updatePost(RegisterDto productDto, BindingResult bindingResult, Model model);
}
