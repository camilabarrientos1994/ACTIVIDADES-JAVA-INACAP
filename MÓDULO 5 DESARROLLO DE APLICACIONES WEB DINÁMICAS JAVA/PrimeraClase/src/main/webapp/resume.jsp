<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
 <%
      String msg = session.getAttribute("msg").toString();
   %>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

  <%
    out.print("<p>el mensaje era: </p>"+ msg + "</p>");
  %>
  <p>el mensaje era: <%=msg %>  </p>
  
  <script type="text/javascript">
    alert('<%=msg %>');
  </script>

</body>
</html>