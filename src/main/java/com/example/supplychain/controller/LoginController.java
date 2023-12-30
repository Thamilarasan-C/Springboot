package com.example.supplychain.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.supplychain.service.impl.LoginService;

@RestController
@RequestMapping(path = "/login")
public class LoginController {
    @Autowired
    LoginService service;

    @PostMapping("/{username}/{pwd}")
    String login(@PathVariable String username, @PathVariable String pwd) {
        return service.generateToken(username, pwd);
    }

    @PostMapping("/validate")
    public ResponseEntity<String> tokenValidation(@RequestHeader("Authorization") String authorizationHeader) {
        System.out.println(authorizationHeader);
        String token = service.extractToken(authorizationHeader);
        if (service.validateToken(token)) {
            return ResponseEntity.ok("Valid token");
        }
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid token");
    }
}