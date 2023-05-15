package com.hi.todo.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Log4j2
@Controller
public class TodoDeleteController {

    // 삭제번호를 받고 삭제하고 todo/list로 이동하는 처리를 해보자.
    @RequestMapping("/todo/delete")
    public String deleteTodo(
            @RequestParam("tno") int tno

    ){
        log.info(" /todo/delete");
        log.info("삭제요청번호 : "+tno);
        return "redirect:/todo/list";
        // view가 아니라 우리가 등록했던 url에 가는것?
    }


}
