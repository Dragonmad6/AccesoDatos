package tema1;

import java.io.File;
import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String nombre;
				
		//Name Route
		do {
			
			System.out.println("Escribe una ruta:\n");
			nombre = sc.nextLine();
			
			File carpeta1 = new File(nombre);
			
			if(carpeta1.length()<5) {
				System.out.println("No supera los caracteres requeridos.");
			}
			if(carpeta1.isDirectory()) {
				System.out.println("Es un directorio.");
			}else if(carpeta1.isDirectory()){
				System.out.println("Es un directorio.");
			}
			
			
		}while(nombre.length()<5);
		
	}
}
