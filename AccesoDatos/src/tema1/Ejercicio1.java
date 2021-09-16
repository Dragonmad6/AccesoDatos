package tema1;

import java.io.File;
import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String nombre;
				
		//Name Route
		System.out.println("Escribe una ruta:\n");
		nombre = sc.nextLine();
		
		File carpeta1 = new File(nombre);
		
		for(int i=0; i<nombre.length(); i++) {
			if(nombre.length()<6) {
				System.out.println("Este archivo debe contener al menos 5 caracteres.");
			}else{
				System.out.println("Si va");
			}
		}
	}
}
