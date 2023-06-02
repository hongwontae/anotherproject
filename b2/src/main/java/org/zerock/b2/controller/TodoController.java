package org.zerock.b2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j2;

@RequestMapping("/todo")
@Log4j2
@Controller
public class TodoController {

    @GetMapping("/list")
    public void TodoGetList(){
        log.info("list....");
    }

    @GetMapping("/add")
    public void add(){
      log.info("Add");
    }
  
    @PostMapping("/add")
    public String addPost(){
      log.info("Add Post..............");
      return "redirect:/todo/list";
    }

    @GetMapping("/read/{tno}")
    public String TodoGetRead(@PathVariable("tno") long tno){
        log.info("read....");
        return "/todo/read";
    }

    @GetMapping("/modify/{tno}")
    public String TodoGetModify(
        @PathVariable("tno") long tno
    ){
        return "redirect:/todo/modify";
    }

 
    
}
