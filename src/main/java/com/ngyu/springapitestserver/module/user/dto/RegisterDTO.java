package com.ngyu.springapitestserver.module.user.dto;

import lombok.*;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
public class RegisterDTO {

    @NotEmpty(message = "이름 입력은 필수 입니다.")
    private String userName;
    @NotEmpty(message = "이메일 입력은 필수 입니다.")
    private String userEmail;
    @NotEmpty(message = "비밀번호 입력은 필수 입니다.")
    @Size(min = 5, message = "비밀번호는 최소 5자 이상이어야 합니다.")
    private String userPassword;
    private int userAge;
    @NotEmpty(message = "성별 입력은 필수 입니다.")
    private String userGender;

}
