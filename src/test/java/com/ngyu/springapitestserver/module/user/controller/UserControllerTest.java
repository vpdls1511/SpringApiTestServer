package com.ngyu.springapitestserver.module.user.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.HashMap;
import java.util.Map;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(UserController.class)
public class UserControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    static Map<String,Object> input = new HashMap<>();

    @Test
    @DisplayName("회원가입 1 - pass")
    void signupTest() throws Exception {

        input.put("userName","김남규");
        input.put("userEmail","vpdls1511@gmail.com");
        input.put("userPassword","Test1234!!");
        input.put("userAge",23);
        input.put("userGender","Male");

        mockMvc.perform(post("/api/user")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(input)))
                .andExpect(status().isOk())
                .andDo(print());
    }

    @Test
    @DisplayName("회원가입 2 - err")
    void signupTest2() throws Exception{
        input.put("userName","김남규");
        input.put("userEmail","vpdls1511@gmail.com");
        input.put("userPassword","Test1234!!");
        input.put("userAge","23213213123djfaipas");
        input.put("userGender","Male");

        mockMvc.perform(post("/api/user")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(input)))
                .andExpect(status().isBadRequest())
                .andDo(print());
    }
}
