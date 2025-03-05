<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
Cookie name = new Cookie("username", request.getParameter("username"));
Cookie age = new Cookie("age", request.getParameter("age"));
Cookie gender = new Cookie("gender", request.getParameter("gender"));

name.setMaxAge(60*60*24); // 1 day
age.setMaxAge(60*60*24);  // 1 day
gender.setMaxAge(60*60*24); // 1 day

response.addCookie(name);
response.addCookie(age);
response.addCookie(gender);

// Retrieve the cookies and display their values
Cookie[] cookies = request.getCookies();
String usernameValue = "";
String ageValue = "";
String genderValue = "";

if (cookies != null) {
    for (Cookie cookie : cookies) {
        if (cookie.getName().equals("username")) {
            usernameValue = cookie.getValue();
        } else if (cookie.getName().equals("age")) {
            ageValue = cookie.getValue();
        } else if (cookie.getName().equals("gender")) {
            genderValue = cookie.getValue();
        }
    }
}
else{
System.out.println("No cookies found");
}
%>

<h1>Getting Cookies</h1>
<p>username = <%= usernameValue %></p>
<p>age = <%= ageValue %></p>
<p>gender = <%= genderValue %></p>

</body>
</html>
