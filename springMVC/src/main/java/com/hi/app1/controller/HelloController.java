package com.hi.app1.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Log4j2
public class HelloController {
    @RequestMapping("/hello")
    public ModelAndView hello(){
        // ModelAndView 응답할 view의 경로와
        // view에 공유할 결과 데이터를 가지고 있는 객체
        ModelAndView mav = new ModelAndView();
        // view 경로를 설정(지정)
        mav.setViewName("hello"); // WEB-INF-views/hello.jsp이다.

        // service한테 요청받아서 응답 데이터를 공유하는 과정
        mav.addObject("greeting","Hello!!");
        //view로 전달할 데이터를 설정해주는 것이다.
        return mav;
    }
}
