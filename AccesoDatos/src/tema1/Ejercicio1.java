package tema1;

import java.io.File;
import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String nombre;
		boolean bucle = false;
		//Name Route
		//		C:\Users\Carlosc\Desktop\Pruebas01.txt
		do {

			System.out.println("Escribe una ruta:\n");
			nombre = sc.nextLine();

			File carpeta1 = new File(nombre);
			System.out.println(carpeta1.getName());

			//System.out.println(carpeta1.getName());
			if(carpeta1.isDirectory()) {
				System.out.println("Es un directorio.");
			}			
			if(carpeta1.getName().endsWith("txt")) {
				if((carpeta1.getName().length()-4)>5) {   
					System.out.println("Está bien");
					bucle = true;
				}
			}

		}while(bucle);

	}
}
