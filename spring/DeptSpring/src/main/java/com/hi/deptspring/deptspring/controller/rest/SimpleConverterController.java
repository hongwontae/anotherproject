package com.hi.deptspring.deptspring.controller.rest;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/mc/simple")
@Log4j2
public class SimpleConverterController {

    @GetMapping
    public void form(){
        log.info("GET /mc/simple..... Form");
    }

    @PostMapping
    @ResponseBody
    public String simple(
            @RequestBody String body
    ){
        log.info("body >>> "+body);

        return "body >>>>";
    }

}
