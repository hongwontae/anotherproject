package com.hi.app1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ErrorTestController {

    @RequestMapping("/errortest")
    public String gerError(){

        String str = null;
        str.toString();

        return "index";
    }

}
