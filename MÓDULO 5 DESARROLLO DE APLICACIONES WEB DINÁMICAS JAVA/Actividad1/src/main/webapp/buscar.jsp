<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
  <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.5/dist/umd/popper.min.js" integrity="sha384-Xe+8cL9oJa6tN/veChSP7q+mnSPaj5Bcu9mPX5F5xIGE0DVittaqT5lorf0EI7Vk" crossorigin="anonymous"></script>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
   <script type="text/javascript" src="js/Actualizar.js"></script>
<style type="text/css">
 .container{
   margin:5%;
   padding:2% 6% 6% 6%;
   margin-left:8%;
 }
 h2{
 text-align:center;
 margin-top:3%;
 }
 .buscar{
    margin:2%;
   padding:3% 3% 3% 3%;
   margin-left:18%;
 }
</style>
<meta charset="ISO-8859-1">
<title>Reparación de electrodomesticos</title>
			                  						<c:set var="v" value="sessionScope.todo"/>

</head>
<body>

    <div class="buscar">
		<label for="exampleDataList" class="form-label">Buscar Nombre</label>
		<input class="form-control" list="datalistOptions" id="exampleDataList" placeholder="Type to search...">
		<datalist id="datalistOptions">
		<c:forEach var="i" items="${sessionScope.todo }">
		    <option value="${i.nombre }">
		</c:forEach>
		</datalist>    
    </div>
   
    
	<div class="container">
		<div class="row justify-content-center">
			<div class="col col-lg-8">
				<table class="table">
					<thead>
						<tr>
							<th scope="col">Nombre</th>
							<th scope="col">Telefono</th>
							<th scope="col">Direccion</th>
							<th scope="col">Tipo electrodomestico</th>
			     			<th scope="col">Fecha pedido</th>
			     			<th scope="col">Ultima actualizacion</th>
                            <th scope="col">Actualizar</th>
						</tr>	
					</thead>
					<tbody>
					 <c:forEach var="v" items="${sessionScope.todo }">
					
						<tr>							
							<td><c:out value="${v.nombre }"/></td>
							<td><c:out value="${v.telefono }"/></td>
							<td><c:out value="${v.direccion }"/></td>
							<td><c:out value="${v.tipo }"/></td>
							<td><c:out value="${v.fecha }"/></td>
							<td><c:out value="${v.actualizacion }"/></td>
							
			                <td>
			                
			                  <form action="/Actividad1/Modificar" method="post" id="actualizar${v.id}">
			                    <input type="hidden" value="${v.id}" name="id">
			                    <input type="button" value="Modificar" onClick="actualizar('${v.id}')">
			                  </form>
			               </td>
							</tr>
						</c:forEach>						
					</tbody>
				</table>			
			</div>
		</div>
	</div>
</body>
</html>
