package com.ngyu.springapitestserver.module.user.dto;

import lombok.*;

public class SignIn {

    @Getter
    @Setter
    @Builder
    public static class Info{
        private int id;
        private String userName;
        private int userAge;
        private String userGender;
    }

    @Getter
    @Setter
    public static class Request{
        private String userEmail;
        private String userPassword;
    }

    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Response{
        private Info info;
        private String userEmail;
    }

}
