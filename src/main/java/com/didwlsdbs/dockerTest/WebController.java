package com.didwlsdbs.dockerTest;


import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class WebController {

    private final MemberService service;

    @GetMapping("/")
    public String hello(){
        return "hello";
    }

    @GetMapping("/members")
    public ResponseEntity<?> members(){
        List members = service.findAll();

        return new ResponseEntity<>(members, HttpStatus.OK);
    }
}
