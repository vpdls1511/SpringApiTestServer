package com.ngyu.springapitestserver.module.user.domain;

import com.ngyu.springapitestserver.module.user.dto.SignIn;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Builder
public class AuthDomain {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String userName;
    private String userEmail;
    private String userPassword;
    private int userAge;
    private String userGender;

    public SignIn.Response toResponseDTO(String userEmail){
        SignIn.Info info = SignIn.Info.builder()
                .id(id)
                .userAge(userAge)
                .userGender(userGender)
                .userName(userName)
                .build();
        return new SignIn.Response(info, userEmail);
    }
}
