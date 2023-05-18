package com.hi.board.service;

import com.hi.board.domain.RequestRegBoard;
import com.hi.board.mapper.BoardMapper;
import org.springframework.stereotype.Service;

@Service
public class BoardWriteService {

    private BoardMapper boardMapper;

    private int writeBoard(
            RequestRegBoard board
    ){
        return boardMapper.insertBoard(board);
    }


}
