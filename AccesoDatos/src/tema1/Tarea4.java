/**
 * 
 */
package tema1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author CMaster
 *
 */
public class Tarea4 {

	/**
	 * Programa para leer un archivo. Controla las excepciones.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File archivo = null;
		FileReader fr = null;
		BufferedReader br = null;

		try {
			archivo = new File(args[0]);
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);

			String read;

			while ((read = br.readLine()) != null)
				System.out.println(read);
			br.close();
			fr.close();
		} catch (FileNotFoundException f) {
			f.printStackTrace();
		} catch (IOException ioex) {
			ioex.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException array) {
			array.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
