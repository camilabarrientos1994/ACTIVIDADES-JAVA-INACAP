package menu;

import java.util.ArrayList;
import java.util.Scanner;

import models.Auto;
import models.Cliente;
import models.Mantencion;

public class Menu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		int opcion;
		do {
			System.out.println("****************MENU**********************");
			System.out.println("Para agregar cliente presione 1 \n" + "Para agregar auto presione 2 \n"
					+ "Para agregar mantención presione 3 \n" + "Para eliminar cliente presione 4 \n"
							+ "Para listar usuarios presione 5");
		       System.out.println("**************************************");

			 opcion = sc.nextInt();
			switch (opcion) {
			case 1:
				System.out.println("Ingrese los nombres");
				String nom = sc.next();
				System.out.println("Ingrese los apellidos");
				String app = sc.next();
				System.out.println("Ingrese el rut ");
				String rut = sc.next();
				System.out.println("Ingrese el email");
				String email = sc.next();
				System.out.println("Ingrese el telefono o celular ");
				String fono = sc.next();
				Cliente cli = new Cliente(nom, app, rut, email, fono);
				if (clientes.contains(cli)) {
					System.out.println("Cliente ya registrado");
				} else {
					clientes.add(cli);
					System.out.println("cliente registrado con éxito");
				}
				break;
			case 2:
				System.out.println("Ingrese el ppu");
				String ppu = sc.next();
				System.out.println("Ingrese la marca");
				String marca = sc.next();
				System.out.println("Ingrese el modelo ");
				String modelo = sc.next();
				System.out.println("Ingrese el año");
				int anio = sc.nextInt();
				Auto auto = new Auto(ppu, marca, modelo, anio);

				System.out.println("Auto registrado con exito");
				break;
			case 3:
				System.out.println("Ingrese la mantencion");
				String tipo = sc.next();
				System.out.println("Ingrese observaciones");
				String observacion = sc.next();
				System.out.println("Ingrese el monto ");
				int monto = sc.nextInt();
				Mantencion mantencion = new Mantencion(tipo, observacion, monto);
				System.out.println("Auto registrado con exito");
				break;
			case 4:
				System.out.println("Ingrese el rut del usuario a borrar");
				String id = sc.next();
				for (Cliente c : clientes) {
					if (c.getRut().equals(id)) {
						clientes.remove(c);
						System.out.println("cliente borrado con exito");
					} else {
						System.out.println("cliente no se encuentra registrado");
					}

				}
				break;
			case 5:
				for (Cliente c : clientes) {
					System.out.println("nombres: "+c.getNombres()+" -Apellidos: "+c.getApellidos()+"-"
							+ " rut: "+c.getRut());
				}
				break;

		}

	

		
	}while(opcion !=0);
  }
}



