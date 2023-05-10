package com.hi.app1.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/login")
@Log4j2
public class LoginController {

    //doget메서드
    @RequestMapping(method = RequestMethod.GET)
    public String loginForm(){
        log.info("/login... /login...");
        return "member/loginForm";
    }

    //dopost메서드
    @RequestMapping(method = RequestMethod.POST)
    public  String login(){

        log.info("get || post");

        //post처리 후 redirect
        return "redirect:/sample/sample01";
        // http://localhost8080/sample/sample01
    }
}
