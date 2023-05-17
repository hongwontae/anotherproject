package com.hi.deptspring.deptspring.controller.rest;

import com.hi.deptspring.deptspring.domain.DeptDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/test")
public class ExampleRestController {

    // 메서드의 반환타입이 String이면 그냥 문자열 응답이다.
    @GetMapping("/sample1")
    public String hello(){
        return "NNNNNY";
    }
    @GetMapping("/sample2")
    public DeptDTO getDept(){
        DeptDTO dept= DeptDTO.builder().deptno(90).dname("DEV").loc("Seoul").build();

        return dept;
    }

    @GetMapping("/sample3")
    public List<DeptDTO> getDeptList(){
        List<DeptDTO> list = new ArrayList<>();
        list.add(new DeptDTO(10,"Test1","LOC1"));
        list.add(new DeptDTO(20,"Test2","LOC2"));
        list.add(new DeptDTO(30,"Test3","LOC3"));
        list.add(new DeptDTO(40,"Test4","LOC4"));

        return list;
    }

    @GetMapping("/sample4")
    public Map<Integer, DeptDTO> getDeptMap(){

        Map<Integer, DeptDTO> map = new HashMap<>();
        map.put(10,new DeptDTO(10,"test1","loc1"));
        map.put(20,new DeptDTO(20,"test2","loc2"));
        map.put(30,new DeptDTO(30,"test3","loc3"));

        return map;
    }

}
