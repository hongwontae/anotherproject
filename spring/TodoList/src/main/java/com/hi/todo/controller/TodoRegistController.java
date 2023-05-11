package com.hi.todo.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Log4j2
@RequestMapping("/todo/regist")
@Controller
public class TodoRegistController {

    // get : form 페이지로 응답처리
    @RequestMapping(method = RequestMethod.GET)
    public String getRegistForm(){

        log.info("Get /todo/regist ");

        return "/todo/registForm";
        // /WEB-INF/view/todo/registForm.jsp
    }


    // post : redirect => todo/list로 보낼거다. view가 필요가 없다.
    @RequestMapping(method = RequestMethod.POST)
    public String regist(){
        log.info("post  /todo/regist");
        return "redirect: /todo/list";
        // 일반 view와 구분은 redirect 문자열로 구분한다.
        // http://localhost:8080/todo/list
    }


}
