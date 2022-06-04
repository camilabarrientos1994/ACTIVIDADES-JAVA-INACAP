<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
   <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.5/dist/umd/popper.min.js" integrity="sha384-Xe+8cL9oJa6tN/veChSP7q+mnSPaj5Bcu9mPX5F5xIGE0DVittaqT5lorf0EI7Vk" crossorigin="anonymous"></script>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Reparación de electrodomesticos</title>
<style type="text/css">
 .container{
   margin:5%;
   padding:2% 6% 6% 6%;
   margin-left:18%;
 }
 h2{
 text-align:center;
 margin-top:3%;
 }
</style>
</head>
<body>
   <h2>Ingreso solicitud reparación</h2>

 <div class="container">
   <div class="row">
      <div class="col col-lg-8">
         <form class="form" method="post" action="/Actividad1/Index">
         
             <div class="form-group">
              <label>Nombre cliente</label>
              <input type="text" placeholder="cliente" name="nombre" class="form-control" required="required">
             </div>
             
             <div class="form-group">
              <label>Teléfono</label>
              <input type="text" placeholder="telefono" name="telefono" class="form-control" required="required">
             </div>
             
             <div class="form-group">
              <label>Dirección</label>
              <input type="text" placeholder="direccion" name="direccion" class="form-control" required="required">
             </div>
             
             <div class="form-group">
              <label>Tipo electrodomestico</label>
              <select name="tipo" class="form-select" >
                <option selected="selected">Seleccionar</option>
                <option>Lavadora</option>
                <option>refrigerador</option>
                <option>Microondas</option>
                <option>Secadora</option>
                <option>Aspiradora</option>
                <option>Televisor</option>
                <option>Estufa</option>
                <option>Otro</option>

              </select>
             </div> 
             <br>
          <input type="submit" value="registrar" class="btn btn-primary">
       <br><br>
         </form>
            <a type="button" class="btn btn-info" href="/Actividad1/home.jsp">ir al menú </a>
<!--           <a type="button" class="btn btn-info" href="/Actividad1/actualizacion.jsp"> Actualización </a> -->
      
      </div>
   </div>
 </div>

</body>
</html>