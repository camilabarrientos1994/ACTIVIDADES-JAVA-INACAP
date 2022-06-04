<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Reparación de electrodomesticos</title>
<style type="text/css">
 .container{
   margin:5%;
   padding:0% 6% 2% 6%;
   margin-left:18%;
 }
 h2{
 text-align:center;
 margin-top:3%;
 }
 
</style>

</head>
<body>
   <h2>Ficha del producto</h2>

 <div class="container">
   <div class="row">
      <div class="col col-lg-8">
      
       <c:set var="t" value="${sessionScope.solicitud }"></c:set>

      <h4>Nombre cliente</h4>
       <span><c:out value="${t.nombre}"></c:out> </span>
       
       <h4>Teléfono:</h4>
       <span><c:out value="${t.telefono}" /> </span>
       
       <h4>Dirección:</h4>
       <span><c:out value="${t.direccion}" /> </span>
       
       <h4>Tipo electrodomestico:</h4>
       <span><c:out value="${t.tipo}" /> </span>

       <h4>Fecha solicitud:</h4>
       <span><c:out value="${t.fecha}" /> </span>
              
       <h4>Última actualización:</h4>
       <span><c:out value="${t.actualizacion}" /> </span>
       
       <h4>Id de pedido:</h4>
       <span><c:out value="${t.id}" /> </span>
       <br><br>
             
        <a type="button" class="btn btn-info" href="/Actividad1/index.jsp"> Volver al menú </a>
      </div>
   </div>



 </div>

</body>
</html>