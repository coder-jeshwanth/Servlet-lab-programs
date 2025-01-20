<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Program 6 server</title>
</head>
<body>

<%response.getWriter(); %>
<%!int numb1,numb2,sum=0,sub=0,mul=0,div=0,mod=0; %>
<%numb1 = Integer.parseInt(request.getParameter("num1")); %>
<%numb2 = Integer.parseInt(request.getParameter("num2")); %>
<% 
sum=numb1+numb2;
sub=numb1-numb2;
mul=numb1*numb2;
div=numb1/numb2;
mod=numb1%numb2;

out.println("Sum is: "+sum);
out.println("<br>Difference is: "+sub);
out.println("<br>Product is: "+mul);
out.println("<br>Division is: "+div);
out.println("<br>Modulas is: "+mod);

for(int i=numb1;i<=numb2;i++)
	if(i%2==0)
	{
		out.println("<br>Even Numbers are:"+i);
		out.println("<br>");
	}

for(int i=numb1;i<=numb2;i++)
	if(i%2!=0)
	{
		out.println("<br>Odd Numbers are:"+i);
		out.println("<br>");
	}
%>


</body>
</html>
