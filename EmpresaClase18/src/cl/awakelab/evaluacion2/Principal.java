package cl.awakelab.evaluacion2;

import java.util.Scanner;

/* *
 * @ Clase hija Profesional
 * @ autores Jorge, Catherine, Yamilet
 * @ versión 16/11/2020 7
 * 
 */
public class Principal {

	/**
	 * El método main.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Contenedor lista = new Contenedor();
		Contenedor listaC = new Contenedor();
		int op;
				
		do {
			
			System.out.println("****Menú****");
			System.out.println("Seleccione una opción");
			System.out.println("1.- Almacenar cliente");
			System.out.println("2.- Almacenar profesional");
			System.out.println("3.- Almacenar administrativo");
			System.out.println("4.- Almacenar capacitación");
			System.out.println("5.- Eliminar usuario");
			System.out.println("6.- Listar Usuario");
			System.out.println("7.- Listar usuario por tipo");
			System.out.println("8.- Listar capacitaciones");
			System.out.println("9.- Salir");
			System.out.println("******************");
			
			op = sc.nextInt();
			
			switch (op) {
			case 1:							
				lista.almacenarCliente(null);;
				
				break;
			case 2:
				lista.almacenarProfesional(null);
				
				break;
			case 3:
				lista.almacenarAdministrativo(null);
				
				break;
			case 4:							
				listaC.almacenarCapacitacion(null);
				break;
			case 5:				
				lista.eliminarUsuario();
				break;
			case 6:
				lista.listarUsuario();
				break;
			case 7:
				lista.listarUsuarioPorTipo();
				break;
			case 8:		
				System.out.println("Ingrese el rut del cliente a buscar ");
				sc.nextLine();
				String buscar = sc.nextLine();
				lista.listarCliente(buscar);
				listaC.listarCapacitaciones(buscar);
				break;
			case 9:
				System.out.println("Ha seleccionado Salir");
				break;
			default: System.out.println("Opción no válida");
			}	
			
			
		}while(op != 9);

		
		sc.close();



	}

}
