package com.ngyu.springapitestserver.module.user.domain;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.*;

@Getter
@Setter
public class RegisterRequest {
    //TODO : 회원가입 시 받을 값 정하고, DTO 개념 공부 후 적용하기

    private String userName;
    private String userEmail;
    private String userPassword;
}
