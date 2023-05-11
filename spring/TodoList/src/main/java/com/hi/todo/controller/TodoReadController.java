package com.hi.todo.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Log4j2
@Controller
public class TodoReadController {
    @RequestMapping("/todo/read")
    public void getRead(Model model){
        log.info("get|post  /todo/read");
        model.addAttribute("Todo", "Todo");
        // WEB-INF/views/todo/read.jsp
    }

}
