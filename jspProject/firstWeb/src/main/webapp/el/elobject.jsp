<%@page import="product.Product"%>
<%@page import="member.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%
 //request.setAttribute("name", "son");
 session.setAttribute("name", "이강인");
 
 Member member = new Member();
 member.setId("cool");
 member.setPassword("1234");
 member.setName("COOL");
	
 session.setAttribute("member", member);
 session.setAttribute("product", new Product());
 
 %>   
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EL Object</title>
</head>
<body>

<h4>
가격 : ${product.price}<br>
첫 번쨰 제품 ${product.list[2]}/ ${product.list}
</h4>

<h4>
	${sessionScope.member}<br>
	${member}
</h4>

<h4>
${member.id} / ${member.password} / ${member.name }
/ ${member.info}
</h4>

<h4>
	${100+10} ${10 mod 3} ${10 eq 10 }
	${'aaa' eq 'aaa' and 1 ==1}
</h4>


<h4>
	${true}/ ${false} / ${100}/ ${3.14} ${'손흥민'}
	/${null}
</h4>

<h4>
 표현식 : <%= request.getAttribute("name") %>
</h4>
<h4>
표현언어 : ${requestScope.name}/${name}
</h4>
<h4> <a href ="${pageContext.request.requestURL}?code=100">link</a>
	${pageContext.request.requestURL}<br>
	${pageContext.request.requestURI}<br>
	${pageContext.request.contextPath}<br>
	<%= request.getContextPath() %><br>
</h4>













</body>
</html>