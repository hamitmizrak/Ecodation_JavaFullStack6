package com.hamitmizrak.controller.mvc;

import com.hamitmizrak.bean.ModelMapperBean;
import com.hamitmizrak.business.dto.RegisterDto;
import com.hamitmizrak.data.entity.RegisterEntity;
import com.hamitmizrak.data.repository.IRegisterRepository;
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
//@RequestMapping("product")
public class RegisterController implements IRegister {

    //Injection
    private final IRegisterRepository iRegisterRepository;
    private final ModelMapperBean modelMapperBean;


    //Speed
    //http://localhost:8080/speed
    @GetMapping("speed")
    @Override
    public String createSpeed(Model model) {
        for (int i = 1; i <= 5; i++) {
            RegisterEntity registerEntity = RegisterEntity.builder()
                    .name("adi " + i).surname("surname " + i).password("password " + i).email("email" + i + "@gmail.com")
                    .build();
            iRegisterRepository.save(registerEntity);
        }
        return "redirect:/list/register";
    }

    //LIST
    //http://localhost:8080/list/register
    @GetMapping("list/register")
    @Override
    public String getAllDataList(Model model) {
        List<RegisterEntity> productEntityList = iRegisterRepository.findAll();
        model.addAttribute("register_list", productEntityList);
        return "register_list";
    }

    //CREATE
    //http://localhost:8080/save/register
    @GetMapping("save/register")
    @Override
    public String createGet(Model model) {
        model.addAttribute("register_key", new RegisterDto());
        return "register_create";
    }

    //http://localhost:8080/save/register
    @PostMapping("save/register")
    @Override
    //@Transactional//Veri güvenliğini ve veri tutarlılığı için
    public String createPost(@Valid @ModelAttribute("register_key") RegisterDto productDto, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            log.error(bindingResult.hasErrors());
            return "register_create";
        }
        RegisterEntity productEntity = modelMapperBean.modelMapperMethod().map(productDto, RegisterEntity.class);
        iRegisterRepository.save(productEntity);
        return "redirect:/list/register";
    }



    //FIND
    //http://localhost:8080/find/register
    //http://localhost:8080/find/register/1
    @GetMapping({"find/register/{id}","find/register"})
    @Override
    public String getFindList(@PathVariable("id") Long id, Model model) {
        Optional<RegisterEntity> findEntity = iRegisterRepository.findById(id);
        if (findEntity.isPresent()) {
            model.addAttribute("find_key", findEntity.get());
            return "register_detail";
        } else {
            model.addAttribute("find_key", id + " nolu veri bulunamadı");
        }
        return "redirect:/list/register";
    }

    //DELETE
    //http://localhost:8080/delete/1
    @GetMapping("delete/register/{id}")
    @Override
    public String getDelete(@PathVariable("id") Long id, Model model) {
        Optional<RegisterEntity> findEntity = iRegisterRepository.findById(id);
        if (findEntity.isPresent()) {
            model.addAttribute("delete_key", findEntity.get());
            iRegisterRepository.deleteById(id);
        } else {
            model.addAttribute("delete_key", id + " nolu veri bulunamadı");
        }
        return "redirect:/list/register";
    }

    //UPDATE
    //http://localhost:8080/update/register/1
    @GetMapping("update/register/{id}")
    @Override
    public String updateGet(@PathVariable("id") Long id, Model model) {
        Optional<RegisterEntity> findEntity = iRegisterRepository.findById(id);
        if (findEntity.isPresent()) {
            model.addAttribute("update_key", findEntity.get());
            return "register_update";
        } else {
            model.addAttribute("update_key", id + " nolu veri bulunamadı");
        }
        return "redirect:/list/register";
    }

    //http://localhost:8080/product/update/1
    @PostMapping("update/register/{id}")
    @Override
   // @Transactional//Veri güvenliğini ve veri tutarlılığı için
    public String updatePost(@Valid @ModelAttribute("update_key") RegisterDto productDto, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            log.error(bindingResult.hasErrors());
            return "register_update";
        }
        RegisterEntity productEntity = modelMapperBean.modelMapperMethod().map(productDto, RegisterEntity.class);
        iRegisterRepository.save(productEntity);
        return "redirect:/list/register";
    }
}
