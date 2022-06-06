package MyCar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		int opcion;

		Scanner sc = new Scanner(System.in);
		ArrayList<Cliente> clients = new ArrayList<Cliente>();
		ArrayList<Auto> autos = new ArrayList<Auto>();
		ArrayList<Mantencion> mantenciones = new ArrayList<Mantencion>();
		Map <String, Informacion> map = new HashMap<String, Informacion>();

		do {
			System.out.println("****************Menú atención******************");
			System.out.println("Ingrese 1 para agregar cliente \n" + "Ingrese 2 para agregar auto \n"
					+ "Ingrese 3 para agregar mantención \n"
					+ "Ingrese 4 para mostrar lista de clientes \n"
					+ "Ingrese 5 para eliminar cliente");
			opcion = sc.nextInt();
			switch (opcion) {
			case 1:
				System.out.println("Ingrese el primer nombre");
				String nom1 = sc.next();
				System.out.println("Ingrese el segundo nombre");
				String nom2 = sc.next();
				System.out.println("Ingrese el primer apellido");
				String app1 = sc.next();
				System.out.println("Ingrese el segundo apellido");
				String app2 = sc.next();
				System.out.println("Ingrese el rut ");
				String rut = sc.next();
				System.out.println("Ingrese el email");
				String email = sc.next();
				System.out.println("Ingrese el telefono o celular ");
				String fono = sc.next();
				Cliente cli = new Cliente(nom1, nom2, app1, app2, rut, email, fono);
				
				clients.add(cli);
	    		cli.datos();
	    		
	    		Informacion info = new Informacion(cli);
	    		String key = cli.getRut();
	    			if(map.containsKey(key) ) {
	    				System.out.println("ya existe el usuario:");
	    				System.out.println(map.get(key));
	    				System.out.println("ingresar datos faltantes? : \n"
	    						+ "1.-Auto \n"
	    						+ "2.-Mantencion \n"
	    						+ "3.-Ambos \n"
	    						+ "4.-Salir");
	    				int nuevaOpcion = sc.nextInt();
	    				
	    				if(nuevaOpcion ==1) {
	    					System.out.println("Ingrese datos del auto:");
	    					System.out.println("Ingrese el ppu");
	    					String ppu = sc.next();
	    					System.out.println("Ingrese la marca");
	    					String marca = sc.next();
	    					System.out.println("Ingrese el modelo");
	    					String modelo = sc.next();
	    					System.out.println("Ingrese el año de fabricacion");
	    					int año = sc.nextInt();
	    					Auto nuevoAuto = new Auto(ppu,marca,modelo,año);
	    					Informacion inf = map.get(key);
                            inf.setAuto(nuevoAuto);
	    					map.put(key,inf);
//	    					map.put(key,);
//		    				Cliente traer = map.get(traer.getRut())

	    				}else if (nuevaOpcion ==2) {
	    					
	    				}else if(nuevaOpcion == 3) {
	    					
	    				}else if(nuevaOpcion == 4) {
	    					
	    				}
//	    				Class<? extends Map> traer = map.getClass();
	    				
	    			}else {
	    				map.put(cli.getRut(),info);
	    			}

	    		break;
	    		
			case 2:
				System.out.println("Ingrese el ppu");
				String ppu = sc.next();
				System.out.println("Ingrese la marca");
				String marca = sc.next();
				System.out.println("Ingrese el modelo");
				String modelo = sc.next();
				System.out.println("Ingrese el año de fabricacion");
				int año = sc.nextInt();
				System.out.println("Ingrese el rut del cliente");
				String rutAsociado = sc.next();
				Auto auto = new Auto(ppu,marca,modelo,año);
				autos.add(auto);
			case 3:
				System.out.println("Ingrese el detalle");
				String mantencionDetalle = sc.next();
				System.out.println("Ingrese observaciones");
				String observacion = sc.next();
				System.out.println("Ingrese el monto");
				float monto = sc.nextFloat();
				Mantencion mantencion = new Mantencion(mantencionDetalle,observacion,monto);
				System.out.println("Ingrese el rut del cliente");
				String rutCliente = sc.next();
				mantenciones.add(mantencion);
			case 4:
				for (Cliente client : clients) {
					System.out.println(client.listaDatos());
				}
				
             
			}

		} while (opcion != 0);
	}
}


