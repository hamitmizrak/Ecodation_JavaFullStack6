package com.hamitmizrak.springboot.controller.mvc;

import com.hamitmizrak.springboot.bean.ModelMapperBean;
import com.hamitmizrak.springboot.business.dto.ProductDto;
import com.hamitmizrak.springboot.data.entity.ProductEntity;
import com.hamitmizrak.springboot.data.repository.IProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

//Lombok
@RequiredArgsConstructor
@Log4j2

//controller
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
    @Transactional//Veri güvenliğini ve veri tutarlılığı için
    public String  createPost(@Valid @ModelAttribute("product_create") ProductDto productDto, BindingResult bindingResult, Model model){
        if(bindingResult.hasErrors()){
            log.error(bindingResult.hasErrors());
            return "product_create";
        }
        ProductEntity productEntity= modelMapperBean.modelMapperMethod().map(productDto, ProductEntity.class);
        iProductRepository.save(productEntity);
        return "redirect:/product_list";
    }

    //LIST
    //http://localhost:8080/product/list
    @GetMapping("list")
    @Override
    public String getAllDataList(Model model){
         List<ProductEntity> productEntityList= iProductRepository.findAll();
        model.addAttribute("product_key_list",productEntityList);
        return "product_list";
    }

    //FIND
    //http://localhost:8080/product/find/1
    @GetMapping("find/{id}")
    @Override
    public String getFindList(@PathVariable("id") Long id, Model model){
        Optional<ProductEntity> findEntity= iProductRepository.findById(id);
        if(findEntity.isPresent()){
            model.addAttribute("product_key_find",findEntity.get());
            return "product_detail";
        }else{
            model.addAttribute("product_key_find",id+" nolu veri bulunamadı");
        }
        return "redirect:/product_list";
    }

    //DELETE
    @GetMapping("delete/{id}")
    @Override
    public String getDelete(@PathVariable("id") Long id, Model model){
        Optional<ProductEntity> findEntity= iProductRepository.findById(id);
        if(findEntity.isPresent()){
            model.addAttribute("product_key_delete",findEntity.get());
            iProductRepository.deleteById(id);
        }else{
            model.addAttribute("product_key_delete",id+" nolu veri bulunamadı");
        }
        return "product_list";
    }


}
