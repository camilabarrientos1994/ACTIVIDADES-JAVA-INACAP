/**
 * 
 */
//  function eliminar(patente){
//	if(confirm("¿seguro quiere eliminar?"))
//	{
//		document.getElementById("eliminar"+patente).submit()
//	}
//}
    function actualizar(id){
//	alert("Ingrese usuario y contrasena");
	var usuario = prompt("Usuario");
	var contrasena = prompt("Contrasena");
	if(usuario == "admin" && contrasena =="admin"){
		document.getElementById("actualizar"+ id).submit()
	}else{
		alert("Usuario o Contraseña incorrecta");
	}
    
}