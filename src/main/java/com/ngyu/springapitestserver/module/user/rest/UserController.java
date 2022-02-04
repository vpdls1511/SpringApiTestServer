package com.ngyu.springapitestserver.module.user.rest;

import com.ngyu.springapitestserver.module.user.dto.RegisterDTO;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @GetMapping("/api/user")
    public RegisterDTO getUser(){
        RegisterDTO reg = RegisterDTO.builder()
                .userName("name")
                .userPassword("password")
                .userEmail("email")
                .userAge(23)
                .userGender("male")
                .build();
        return reg;
    }

    @PostMapping("/api/user")
    public String setUser(
            @RequestBody RegisterDTO regDto,
            Errors errors
    ){
        if(errors.hasErrors()) return "ERR";
        return "TEST";
    }
}
