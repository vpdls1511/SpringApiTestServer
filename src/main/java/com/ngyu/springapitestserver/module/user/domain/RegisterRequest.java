package com.ngyu.springapitestserver.module.user.domain;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.*;

@Getter
@Setter
public class RegisterRequest {
    //TODO : 회원가입 시 받을 값 정하고, DTO 개념 공부 후 적용하기

    @NotEmpty(message = "이름 입력은 필수 입니다.")
    private String userName;

    @NotEmpty(message = "이메일 입력은 필수 입니다.")
    @Pattern(regexp = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+.[A-Za-z]{2,6}$", message = "이메일 형식에 맞지 않습니다.")
    private String userEmail;

    @NotEmpty(message = "비밀번호 입력은 필수 입니다.")
    @Size(min = 5, message = "비밀번호는 최소 5자 이상이어야 합니다.")
    private String userPassword;
}
