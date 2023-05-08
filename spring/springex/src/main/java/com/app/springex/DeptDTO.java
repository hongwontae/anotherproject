package com.app.springex;

import lombok.*;

@Getter //럼버
@Setter //럼버
@AllArgsConstructor // 생성자 코드 작성없이 컴파일 할떄 실행시켜 준다.
@NoArgsConstructor // final 쓸 떄 초기값 무조건 주어야하는데 이게 있으면 된다.
@ToString
public class DeptDTO {
    private int deptno;
    private String dname;
    private String loc;

    public static void main(String[] args) {
        DeptDTO dept = new DeptDTO(2,"test","loc");
        System.out.println(dept);
        dept.setDeptno(10);
        dept.setDname("Accounting");
        dept.setLoc("New York");
        System.out.println(dept.getLoc());

    }
}
