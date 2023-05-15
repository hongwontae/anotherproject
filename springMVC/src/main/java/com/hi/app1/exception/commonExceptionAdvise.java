package com.hi.app1.exception;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
@Log4j2
public class commonExceptionAdvise {

    @ExceptionHandler(Exception.class)
    @ResponseBody    //응답하는 문자열 그대로 응답으로 사용한다.
    public String exception(Exception exception){

        log.info(exception.getMessage());

        StringBuffer sb = new StringBuffer();
        sb.append("<h1>"+exception.getMessage()+"</h1>");



        return "예외 발생!!";
    }



}
