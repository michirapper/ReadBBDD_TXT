import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LecturaFichero {

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new FileReader("./src/datos.txt"));
		String sCadena;
		while ((sCadena = bf.readLine()) != null) {
			System.out.println(sCadena);
		}
	}
}
