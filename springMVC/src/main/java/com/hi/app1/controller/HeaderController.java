package com.hi.app1.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Log4j2
public class HeaderController {

    @RequestMapping("/header/check")
    public String headerCheck(
            @RequestHeader("Host") String host,
            @RequestHeader(value = "test", defaultValue = "not") String test
    ){

        log.info("/header/check");

        log.info("requestHeder : host = " + host);
        log.info("requestHeder : test = " + test);

        return "header/check";
    }


}