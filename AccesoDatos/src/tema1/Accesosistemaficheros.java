package tema1;

import java.io.File;

public class Accesosistemaficheros {
	public static void main(String[] args) {
		File carpeta1 = new File("\\");
		//Give you a list of the carpets and archives.
		File[] listaCarpetas = carpeta1.listFiles();
		
		System.out.println(carpeta1.getName());
		
		for(int i=0; i<listaCarpetas.length; i++) {
			if(listaCarpetas[i].isDirectory()) {
				System.out.println("--");
			}
			if(listaCarpetas[i].getName().endsWith("txt")) {
				System.out.println("-txt-");
			}
			//gayfsd
			System.out.println(listaCarpetas[i].getName());
		}
	}
}
