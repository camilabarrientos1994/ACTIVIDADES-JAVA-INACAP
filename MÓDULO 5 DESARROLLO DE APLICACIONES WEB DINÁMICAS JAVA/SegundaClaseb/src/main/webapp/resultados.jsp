<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="servlets.Mascota" %>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>
<body>
 <%
    Mascota m = (Mascota)session.getAttribute("mascota");
   
 %>

<table>
  <thead>
    <th></th>
        <th>Nombre</th>
        <th>Especie</th>
        <th>edad</th>
        <th>vacunado</th>
  </thead>
  <tbody>
        <td><%=m.getNombre() %>; </td>
        <td><%=m.getEspecie() %> </td>
        <td><%=m.getEdad() %> </td>
        <td> <%=m.isVacuna()? "si":"no" %> </td>
  </tbody>
</table>


<br><br>

<c:set var="mascota" value="${sessionScope.mascota }"></c:set>

<table>
  <thead>
    <th></th>
        <th>Nombre</th>
        <th>Especie</th>
        <th>edad</th>
        <th>vacunado</th>
  </thead>
  <tbody>
        <td><c:out value="${mascota.nombre}"></c:out> </td>
        <td><c:out value="${mascota.especie}"></c:out> </td>
        <td><c:out value="${mascota.edad}"></c:out> </td>
        <td><c:out value="${mascota.vacuna? 'si':'no' }"></c:out>  </td>
  </tbody>
</table>
</body>
</html>