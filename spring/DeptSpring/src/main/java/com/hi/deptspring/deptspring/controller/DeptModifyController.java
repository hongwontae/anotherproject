package com.hi.deptspring.deptspring.controller;

import com.hi.deptspring.deptspring.domain.DeptDTO;
import com.hi.deptspring.deptspring.service.DeptReadService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Log4j2
@Controller
@RequestMapping("/dept/modify")
public class DeptModifyController {

    @Autowired
    private DeptReadService readService;

    @GetMapping
    public String getModifyForm(
        @RequestParam("no") int deptno,
        Model model
    ){

        model.addAttribute("dept",readService.getDept(deptno));
        return "dept/modifyForm";
    }

    @PostMapping
    public String modify(
            DeptDTO dto
    ){
        log.info("post  /dept/modify");
        log.info(dto);
        return "redirect:/dept/list";
    }
}