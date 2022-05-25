/**
 * 
 */
 function eliminar(patente){
	if(confirm("¿seguro quiere eliminar?"))
	{
		document.getElementById("eliminar"+patente).submit()
	}
}