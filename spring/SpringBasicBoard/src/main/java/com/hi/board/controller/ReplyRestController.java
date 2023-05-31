package com.hi.board.controller;

import com.hi.board.domain.ReplyDTO;
import com.hi.board.service.ReplyInsertService;
import com.hi.board.service.ReplyReadService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board/reply")
@Log4j2
public class ReplyRestController {

    @Autowired
    private ReplyInsertService replyInsertService;
    @Autowired
    private ReplyReadService readService;

    @PostMapping
    public ResponseEntity<ReplyDTO> insertReply(
            @RequestBody ReplyDTO replyDTO

    ){

        log.info("dto insert 전"+replyDTO);
        replyInsertService.insertReply(replyDTO);
        log.info("dto insert 후"+replyDTO);

        ReplyDTO result = readService.getReply(replyDTO.getRno());

        return new ResponseEntity<>(result, HttpStatus.OK);

    }

}
