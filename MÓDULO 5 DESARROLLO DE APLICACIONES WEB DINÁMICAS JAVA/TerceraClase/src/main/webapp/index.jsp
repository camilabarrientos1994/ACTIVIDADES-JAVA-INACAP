<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Autos</title>
<style type="text/css">
 .container{
   margin:5%;
   padding:0% 6% 2% 6%;
   margin-left:8%;
 }
 h2{
 text-align:center;
 margin-top:3%;
 }
 </style>
</head>
<body>
  <div class="container">
  <a href="/TerceraClase/Home">Vehiculos</a>
  
     <div class="row justify-content-center">
        <form class="form" method="post" action="/TerceraClase/Home">
	           <div class="form-group">
	             <label>Patente</label>
	             <input type="text" placeholder="patente" name="patente" class="form-control">
	             <c:if test="${sessionScope.error !=null }">
	               <span><c:out value="${sessionScope.error }"></c:out>  </span>
	               <c:remove var="error" scope="session"/>
	             </c:if>
	           </div>
	           
	           <div class="form-group">
	             <label>Marca</label>
	             <select name="marcas" class="form-select" aria-label="Default select">
	                <option selected="selected">Seleccionar</option>
	                <option>Ford</option>
	                <option>Chevrolet</option>
	                <option>Kia</option>
	                <option>Suzuki</option>
	                <option>Fiat</option>
	             </select>
	           </div>
	           
	           <div class="form-group">
	             <label>Año</label>
	             <input type="number" placeholder="2022" name="año" class="form-control" min="1960" max="2022">
	           </div>
	           
	           <div class="form-group form-check">
	             <label>Estado vehiculo</label>
	             <input type="checkbox" name="estado" id="estado" class="form-check-input"></input>
	<!--              <label class="form-control" for="estado">Nuevo</label> -->
	           </div>
       
	           <div class="form-group">
		             <label>Tipo</label><br>
		             <input type="radio"  name="tipo" class="form-check-input" value="suv">
		             <label>Suv</label>
		              <input type="radio"  name="tipo" class="form-check-input" value="cityCar">
		             <label>City Car</label>
		              <input type="radio"  name="tipo" class="form-check-input" value="sedan">
		             <label>Sedan</label>
		              <input type="radio"  name="tipo" class="form-check-input" value="camioneta">
		             <label>Camioneta</label>
		              <input type="radio"  name="tipo" class="form-check-input" value="4x4">
		             <label>4x4</label>
	           </div>
	           <br>
	           <div>
                     <button type="submit" class="btn btn-primary">Enviar</button>
	           </div>
        </div>
     </div>
  </form>
</body>
</html>