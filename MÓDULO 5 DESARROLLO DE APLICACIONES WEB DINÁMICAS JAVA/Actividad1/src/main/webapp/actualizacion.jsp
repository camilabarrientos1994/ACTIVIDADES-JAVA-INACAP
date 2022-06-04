<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>FeedBack de la empresa</title>
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
 a{
  display:inline;
 }
 form{
   display:inline;
 
 }
</style>
</head>
<body>
   <h2>Ficha del producto</h2>
       <c:set var="s" value="${sessionScope.hola }"></c:set>

 <div class="container">
   <div class="row">
      <div class="col col-lg-8">
       <h4>Nombre cliente</h4>
       <p><c:out value="${s.nombre }"></c:out> </p>
       
       <h4>Teléfono:</h4>
       <p><c:out value="${s.telefono }"></c:out> </p>

       <h4>Dirección:</h4>
       <p><c:out value="${s.direccion }"></c:out> </p>

       <h4>Tipo electrodomestico:</h4>
       <p><c:out value="${s.tipo }"></c:out> </p>


       <h4>Fecha solicitud:</h4>
              <p><c:out value="${s.fecha }"></c:out> </p>
       
       <h4>Última actualización:</h4>
              <p><c:out value="${s.actualizacion }"></c:out> </p>
       
       
       <h4>Última actualización:</h4>
     
      <form class="form" method="post" action="/Actividad1/Guardar" id="comentario${s.id }">
           <h4>Comentario:</h4>
	       <textarea rows="5" cols="80%"></textarea>
            <br><br>
          <input type="submit" value="comentario" class="btn btn-primary" >
       </form>  
       <a type="button" class="btn btn-info" href="/Actividad1/index.jsp"> Volver al menú </a>
   </div>
 </div>
 </div>

</body>
</html>