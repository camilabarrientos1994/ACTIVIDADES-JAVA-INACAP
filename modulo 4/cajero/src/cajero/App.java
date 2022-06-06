package cajero;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		int opcion =1;
		String numTarjeta="";
		String claveTarjeta ="";
		Scanner sc = new Scanner (System.in);
		Cajero caj = new Cajero();
		
		do {
			System.out.println("***********MENU CAJERO**************");
			System.out.println("ingrese numero de tarjeta");
			numTarjeta = sc.next();
			
			System.out.println("ingrese clave de tarjeta");
			claveTarjeta = sc.next();
			
			caj.comprobar(numTarjeta,claveTarjeta);
			
			System.out.println("Ingrese numero de opcion:");
			System.out.println("1.-Giro \n"
					+ "2.-Deposito \n"
					+ "3.-Consulta Monto \n"
					+ "4.-Cambio de clave");
			opcion = sc.nextInt();

			
			
	      switch(opcion) {
	      case  1:
	    	 caj.Giro();
	      }
			
			
			
		}while(opcion != 1010);
	}


}
