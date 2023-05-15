package com.hi.app1.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Log4j2
@Controller
@RequestMapping("/mypage")
public class MyPageController {

    @GetMapping("/mypage1")
    public void myPage1() {
        log.info("GET /myPage/mypage1");
    }

    @GetMapping("/mypage2")
    public void myPage2() {
        log.info("GET /myPage/mypage2");
    }

    @GetMapping("/mypage3")
    public void myPage3() {
        log.info("GET /myPage/mypage3");
    }

}
