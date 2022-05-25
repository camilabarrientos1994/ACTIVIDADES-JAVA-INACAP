<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Autos</title>
<style type="text/css">
.container {
	margin: 5%;
	padding: 0% 6% 2% 6%;
	margin-left: 8%;
}

h2 {
	text-align: center;
	margin-top: 3%;
}
</style>
</head>
<body>
	<div class="container">
		<a href="/TerceraClase/Home">Vehiculos</a>
		<c:set var="v" value="${sessionScope.a}"></c:set>
		<div class="row justify-content-center">
			<form class="form" method="post" action="/TerceraClase/Actualizar">

				<div class="form-group">
					<label>Patente</label>
					<!-- 					disable no permite enviar info, por eso readonly -->
					
					 <input value="${v.patente }" readonly="readonly" type="text" placeholder="patente"
						name="patente" class="form-control"/>
				</div>

				<div class="form-group">
					<label>Marca</label> <select name="marcas" class="form-select"
						aria-label="Default select">
						<option selected="selected">Seleccionar</option>
						<c:choose>
						  <c:when test="${v.marca.equals('Ford') }">
						 <option selected="selected">Ford</option>
						  </c:when>
						  <c:otherwise>
						  <option>Ford</option>
						  </c:otherwise>
						</c:choose>
						
							<c:choose>
						  <c:when test="${v.marca.equals('Chevrolet') }">
						  <option selected="selected" >Chevrolet</option>
						  </c:when>
						  <c:otherwise>
						  <option>Chevrolet</option>
						  </c:otherwise>
						</c:choose>
						
							<c:choose>
						  <c:when test="${v.marca.equals('Kia') }">
					  	<option selected="selected">Kia</option>
						  </c:when>
						  <c:otherwise>
						  <option>Kia</option>
						  </c:otherwise>
						</c:choose>
						
							<c:choose>
						  <c:when test="${v.marca.equals('Suzuki') }">
						<option selected="selected">Suzuki</option>
						  </c:when>
						  <c:otherwise>
						<option>Suzuki</option>
						  </c:otherwise>
						</c:choose>
						
							<c:choose>
						  <c:when test="${v.marca.equals('Fiat') }">
						  	<option selected="selected">Fiat</option>
						  </c:when>
						  <c:otherwise>
						  	<option>Fiat</option>
						  </c:otherwise>
						</c:choose>
						
						
					</select>
				</div>

				<div class="form-group">
					<label>Año</label> <input value="${v.anio }" type="number"
						placeholder="2022" name="año" class="form-control" min="1960"
						max="2022">
				</div>

				<div class="form-group form-check">
					<label>Estado vehiculo</label>

					<c:choose>
						<c:when test="${v.estado }">
							<input type="checkbox" checked="checked" name="estado"
								id="estado" class="form-check-input"></input>
						</c:when>
						<c:otherwise>
							<input type="checkbox" name="estado" id="estado"
								class="form-check-input"></input>
						</c:otherwise>
					</c:choose>

				</div>

				<div class="form-group">
					<label>Tipo</label><br> <label>Suv</label>
					<c:choose>
						<c:when test="${v.tipo.equals('suv') }">
							<input type="radio" checked="checked" name="tipo"
								class="form-check-input" value="suv">
						</c:when>
						<c:otherwise>
							<input type="radio" name="tipo" class="form-check-input"
								value="suv">
						</c:otherwise>
					</c:choose>

						<label>City Car</label>
					<c:choose>
						<c:when test="${v.tipo.equals('cityCar') }">
							<input type="radio" checked="checked" name="tipo"
								class="form-check-input" value="cityCar">
						</c:when>
						<c:otherwise>
							<input type="radio" name="tipo" class="form-check-input"
								value="cityCar">
						</c:otherwise>
					</c:choose>

						<label>Sedan</label>
					<c:choose>
						<c:when test="${v.tipo.equals('sedan') }">
							<input type="radio" checked="checked" name="tipo"
								class="form-check-input" value="sedan">
						</c:when>
						<c:otherwise>
							<input type="radio" name="tipo" class="form-check-input"
								value="sedan">
						</c:otherwise>
					</c:choose>

						<label>Camioneta</label>
					<c:choose>
						<c:when test="${v.tipo.equals('camioneta') }">
							<input type="radio" checked="checked" name="tipo"
								class="form-check-input" value="camioneta">
						</c:when>
						<c:otherwise>
							<input type="radio" name="tipo" class="form-check-input"
								value="camioneta">
						</c:otherwise>
					</c:choose>

						<label>4x4</label>
					<c:choose>
						<c:when test="${v.tipo.equals('4x4') }">
							<input type="radio" checked="checked" name="tipo"
								class="form-check-input" value="4x4">
						</c:when>
						<c:otherwise>
							<input type="radio" name="tipo" class="form-check-input"
								value="4x4">
						</c:otherwise>
					</c:choose>


				</div>
				<br>
				<div>
					<button type="submit" value="modificar" class="btn btn-primary">Enviar</button>
				</div>
		</div>
	</div>
	</form>
</body>
</html>