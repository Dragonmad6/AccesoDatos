/**
 * 
 */
package tema1;

import java.io.File;
import java.util.Scanner;

/**
 * @author CMaster
 *
 */
public class Tarea3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
					if (System.currentTimeMillis() - ArchivoActual.lastModified() < (10 * 864000000)) {
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
							System.out.println("----------SOLO LEER----------");
							if (f.canRead()) {
								System.out.println("Si\n");
								ArchivoActual.setReadOnly();
							} else {
								System.out.println("No\n");
							}
						}
					}
				}
			}
		} else {
			System.out.println("No es un directorio válido.");
			System.out.println("Se procederá a crear una nueva ruta.");

			f.mkdir();
		}
	}

}
