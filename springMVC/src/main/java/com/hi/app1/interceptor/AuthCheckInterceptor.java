package com.hi.app1.interceptor;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Log4j2
public class AuthCheckInterceptor implements HandlerInterceptor {

    // servlet context에 등록할 것이다.

    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response,
                             Object handler) throws Exception {

        log.info(">>>>> 회원 로그인 여부 체크 :<<<<< ");

        //session 획득, 현재 세션이 존재하지 않으면 null을 반환한다.
        HttpSession session = request.getSession(false);

        // 회원이 로그인 했을 떄 체크가 필요 : return true; => 다음 인터셉터 또는 실행 컨트롤러로 진입한다.
        // session이 널이 아니고, get attirbute("loginInfo")가 null이 아니면 => 로그인 상태이다.
        if(session != null && session.getAttribute("loginInfo") != null){
            log.info("회원 로그인 체크... 로그인 상태!!!");
            return true;
        }
        
        log.info("회원 로그인 체크 : 비 로그인 상태");
        // 로그인 페이지로 이동하도록
        response.sendRedirect("/login");
        
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
    }
}
