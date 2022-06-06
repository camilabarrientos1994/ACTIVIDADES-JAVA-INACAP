package varios;

import java.util.Scanner;


public class pro {

	public static void main(String[] args) {

	
		Scanner sc = new Scanner(System.in);
	
		int num=sc.nextInt();
		int pares =0;
		int impares=0;
		int par=0;
		int impar=0;
		while(par<11 && impar<11) {
			for(int i =1;i<=100;i++) {
				int numero= num +i;
				if(numero %2==0) {
					pares=pares+numero;
					par ++;
				}else {
					impares=impares+ numero;
					impar ++;
				}
			}
		}		int diferencia = pares - impares;

		
		System.out.println("la suma de pares es: "+pares+
				" y la suma de impares es: "+impares+",la diferencia es: "+
				diferencia);
	}
}