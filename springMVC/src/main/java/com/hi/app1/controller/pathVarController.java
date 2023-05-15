package com.hi.app1.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Log4j2
public class pathVarController {

    //경로의 일부분을 변수로 사용하겠다.
    @RequestMapping("/members/{type}/{idx}") //http://localhost:8080/members/10
    public String getMemberInfo(
            @PathVariable("idx") String idx,
            @PathVariable("type") String type,
            Model model
    ){

        log.info("idx = "+idx);
        log.info("type : "+type);
        model.addAttribute("idx",idx);
        model.addAttribute("type",type);
        return "member/info";
    }

}
