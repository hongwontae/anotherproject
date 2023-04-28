<%@page import="java.util.ArrayList"%>
<%@page import="member.Member"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
List<Member> members = new ArrayList<Member>();
members.add(new Member("coll00","0000","COOL00"));
members.add(new Member("coll10","0000",null));
members.add(new Member("coll20","0000","COOL02"));
members.add(new Member("coll30","0000","COOL03"));
members.add(new Member("coll40","0000",null));
members.add(new Member("coll50","0000",null));
members.add(new Member("coll60","0000","COOL06"));
members.add(new Member("coll70","0000",null));
members.add(new Member("coll80","0000","COOL08"));
members.add(new Member("coll90","0000","COOL09"));

session.setAttribute("members", members);

%>

</body>
</html>