package com.hi.todo.domain;


import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class TodoRequest {

    // 파라미터 값을 받아서 저장할 변수를 정의한다.
    // 파라미터 변수의 이름은 파라미터의 이름과 같이 정의
    // Java Beans 형식 => 변수가 private

    private String todo;
    private String duedate;


}
