package com.hi.app1.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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
    public  String login(
            HttpServletRequest request

    ){

        log.info("get || post");

        //로그인 처리
        HttpSession session = request.getSession();
        session.setAttribute("loginInfo","login");
        log.info("로그인 처리");

        //post처리 후 redirect
        return "redirect:/sample/sample01";
        // http://localhost8080/sample/sample01
    }
}
