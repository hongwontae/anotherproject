package com.hi.app1.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Log4j2
public class SampleController {

    @RequestMapping("/sample/sample01") //localhost:8080/sample/sample1
    public void getPage1(){
        log.info("/sample/sample01 .... getPage()..");
        // void 반환의 경우 -> view의 경로는 url 설정 경로로 처리된다.
        // return "sample/sample1"/ WEB-INF/views/sample/sample1.jsp


    }

    @RequestMapping("/sample/sample02")
    public void getPage2(Model model){
                log.info("/sample/sample02 ... getPage()");
                //model객체는 view와 공유할 수 있는 데이터를 저장하는 객체이다.
                // 매개변수에 model 형식으로 선언해주면 메서드 호출시에
                // 현재 모델객체를 전달해준다.
                model.addAttribute("msg","안녕하세요");

    }
    @RequestMapping("/sample/sample03")
    public String getPage3(Model model){

    model.addAttribute("msg","반갑습니다.");
    return "sample/sample02";
    // WEB-INF/views/sample/sample02.jsp
        // 색다른 접근으로 이용했다.

    }


}
