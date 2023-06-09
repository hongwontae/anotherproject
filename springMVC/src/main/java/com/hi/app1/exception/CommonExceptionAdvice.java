package com.hi.app1.exception;

import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
@Log4j2
public class CommonExceptionAdvice {

    @ExceptionHandler(Exception.class)
    @ResponseBody    // 응답하는 문자열 그대로 응답으로 사용
    public String exception(Exception exception){

        log.info(exception.getMessage());

        StringBuffer sb = new StringBuffer();
        sb.append("<h1>" + exception.getMessage()  + "</h1>");
        sb.append("<hr>");

        StackTraceElement[] stackTraceElements = exception.getStackTrace();

        for (StackTraceElement element : stackTraceElements){
            sb.append("<div>" + element + "</div>");
        }


        return sb.toString();

    }



    @ExceptionHandler(NoHandlerFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String notFound(){
        return "custom404";
    }

}