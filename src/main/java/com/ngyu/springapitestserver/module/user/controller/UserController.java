package com.ngyu.springapitestserver.module.user.controller;

import com.ngyu.springapitestserver.module.user.dto.Register;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class UserController {
    //TODO - 로그인 테스트케이스 작성하기
    @GetMapping("/api/user")
    public String getUser(){

        return "";
    }

    //TODO - 회원가입 테스트케이스 작성하기
    @PostMapping("/api/user")
    public ResponseEntity setUser(
            @RequestBody @Valid Register.Request regDto,
            Errors errors
    ){
        if(errors.hasErrors()) return new ResponseEntity(HttpStatus.BAD_REQUEST);
        return ResponseEntity.ok().body(regDto);
    }
}
