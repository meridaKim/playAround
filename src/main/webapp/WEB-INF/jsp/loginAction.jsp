<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ page import="com.example.repository.dao.UserDao" %>
<%@ page import="java.io.PrintWriter" %>
<% request.setCharacterEncoding("UTF-8"); %>
<jsp:useBean id="user" class="com.example.model.entity.User" scope="page" />
<jsp:setProperty name="user" property="userID" />
<jsp:setProperty name="user" property="userPassword" />
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP 게시판 웹 사이트</title>
</head>
<body>
<%
    UserDao userDAO = new UserDao();
    int result = userDAO.login(user.getUserNo(), user.getUserPw());
    if (result == 1) {
        PrintWriter script = response.getWriter();
        script.println("<script>");
        script.println("location.href='MainPage.jsp'");
        script.println("</script>");
    }
    else if (result == 0) {
        PrintWriter script = response.getWriter();
        script.println("<script>");
        script.println("alert('비밀번호가 틀립니다.')");
        script.println("history.back()");
        script.println("</script>");
    }
    else if (result == -1) {
        PrintWriter script = response.getWriter();
        script.println("<script>");
        script.println("alert('존재하지 않는 아이디입니다.')");
        script.println("history.back()");
        script.println("</script>");
    }
    else if (result == -2) {
        PrintWriter script = response.getWriter();
        script.println("<script>");
        script.println("alert('데이터베이스 오류가 발생했습니다.')");
        script.println("history.back()");
        script.println("</script>");
    }
%>
</body>
</html>
