package com.hi.board.controller;

import com.hi.board.domain.RequestRegBoard;
import com.hi.board.service.BoardListService;
import com.hi.board.service.BoardWriteService;
import lombok.extern.log4j.Log4j2;
import oracle.jdbc.proxy.annotation.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Log4j2
public class BoardListController {

    private BoardWriteService writeService;

    @Autowired
    private BoardListService listService;



    @GetMapping ("/board/list")
    public void boardList(
            Model model
    ){

        log.info("/board/list ...");

        model.addAttribute("List",listService.getBoardList());
    }

    @PostMapping
    public String write(
            RequestRegBoard board
    ){
    log.info("POST  /board/write");
    log.info(board);


    return "redirect:/board/list";
    }

}