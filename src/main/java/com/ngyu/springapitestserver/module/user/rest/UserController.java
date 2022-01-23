package com.ngyu.springapitestserver.module.user.rest;

import com.ngyu.springapitestserver.module.user.domain.RegisterRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @PostMapping("/api/user")
    public ResponseEntity<?> getUser(@Validated RegisterRequest userReq, Errors errors){
        if(errors.hasErrors()) return new ResponseEntity(HttpStatus.BAD_REQUEST);
        return new ResponseEntity(HttpStatus.OK);
    }
}
