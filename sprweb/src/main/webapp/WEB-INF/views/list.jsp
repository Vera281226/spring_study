<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>스프링에서 쓰는 jsp</title>
</head>
<body>
리스트
<%
//String ss = (String)request.getAttribute("msg"); // model.addAttribute 는 request.setAttribute와 같다
//out.print(ss);
%>
${msg}
</body>
</html>