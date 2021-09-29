package tema1;

import java.io.File;
import java.util.Scanner;

public class Tarea2 {
	/**
	 * Programa que identifica si una ruta que introduce el usuario es válida o no.
	 * Recorre un listado de todos los ficheros de la ruta Dice las caracteristicas
	 * (Nombre, si se puede editar, si es oculto y sus Bytes) que posee cada
	 * fichero. En el caso de que no exista lo crea y vuelve a preguntar las
	 * características.
	 * 
	 * A continuacion mira si la ruta es absoluta en el caso de que si procede a crear el fichero en el caso de no poder crearlo te avisa.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca un directorio:\n");
		String ruta = sc.nextLine();

		File f = new File(ruta);
		File[] archivos = f.listFiles();

		System.out.println("\nComprobando...\n");

		if (f.exists()) {
			for (int i = 0; i < archivos.length; i++) {
				File ArchivoActual = archivos[i];
				
				if (f.isDirectory()) {
					if (ArchivoActual.isFile()) {
						System.out.println(ArchivoActual.getName() + " " + ArchivoActual.length() + "Kb");
						System.out.println("----------EDITAR----------");
						
						if (ArchivoActual.canWrite()) {
							System.out.println("Si\n");
						} else {
							System.out.println("No\n");
						}
						System.out.println("----------OCULTO----------");
						if (ArchivoActual.isHidden()) {
							System.out.println("Si\n");
						} else {
							System.out.println("No\n");
						}
					}
				}
			}
		} else {
			System.out.println("No es un directorio válido.");
			System.out.println("Se procederá a crear una nueva ruta.");

			if(f.isAbsolute()) {
				try {
					if(f.mkdir()) {
						System.out.println("El directorio ha sido creado.");
					}else {
						System.out.println("El directorio no se ha podido crear.");
					}
				}catch (Exception error) {
					System.out.println("Ha ocurrido el siguiente error: " + error.getMessage());
				}
			}else {
				System.out.println("La ruta no es absoluta.");
			}
		}
	}
}
