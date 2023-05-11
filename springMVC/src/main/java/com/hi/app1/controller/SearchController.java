package com.hi.app1.controller;

import com.hi.app1.domain.UserRequest;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;


@Log4j2
@Controller
public class SearchController {

    @RequestMapping("/search/search1")
    public String getSearch1(Model model, String keyword,
                             @RequestParam(value="tno", required = false) String tno,
                             @RequestParam(value="page",defaultValue = "1") int page,
                             HttpServletRequest request,
                             @ModelAttribute("req") UserRequest userRequest){


        log.info("/search/search1......");
        log.info("keyword : " + keyword);
        log.info("tno : " + tno);
        log.info("page : " + page);
        log.info(userRequest);

        // 사용자가 전달하는 파라미터를 받는 방법
        // 1. 매개변수에 변수를 정의 : 변수의 이름은 파라미터 이름으로 정의
        // 2. @requestParam(): 필수항목, 기본값 정의
        // 3. httpServletRequest
        // 4. Beans 이용

        String keywordStr = request.getParameter("keyword");
        String tnoStr = request.getParameter("tno");
        String pageStr = request.getParameter("page");
        log.info("keywordStr : "+keyword);
        log.info("tnoStr : "+tnoStr);
        log.info("pageStr : "+pageStr);

        model.addAttribute("page",page);
        model.addAttribute("result", keyword+tno);

        return "search/search1";
    }
}