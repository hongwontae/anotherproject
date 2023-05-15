package com.hi.todo.controller;

import com.hi.todo.domain.ModifyTodoRequest;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/todo/modify")
@Log4j2
@Controller
public class TodoModifyController {

    //get은 수정할 수 있는 화면을 만든다.
    @RequestMapping(method = RequestMethod.GET)
    public String getModify(Model model){
        model.addAttribute("todo", "TODO");
        log.info("get  /todo/modify");
        return "/todo/modifyForm";
        // WEB-INF/views/todo/modifyForm.jsp
    }

    //post는 데이터 받고 수정하고 리스트로 리디렉션하는 용도이다.
@RequestMapping(method = RequestMethod.POST)
    public String Modify(
    @ModelAttribute("modifyData") ModifyTodoRequest modifyTodoRequest
){
        log.info("post  /todo/modify");

        log.info(" modifyTodoRequest : "+ modifyTodoRequest);

        //return "todo/modify";
        return "redirect:/todo/list";
        // WEB-INF/views/todo/modify/registForm.jsp
    }
@ModelAttribute("StrData")
    public String getData(){
        return "hello spring";
    }

}
