<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <form action="/SegundaClaseb/index" method="post">
      <input type="text" name="nombre" placeholder="nombre">
      <input type="text" name="especie" placeholder="especie">
      <input type="number" name="edad" placeholder="edad">
      <input type="checkbox" name="vacuna" placeholder="vacunado">
      <input type="submit" value="registrar">
   
 </form>

</body>
</html>