package ejercicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Random;

public class PasaMayusculas {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		Random rand = new Random();
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		
		PrintStream salida = new PrintStream(System.out);
		String linea = entrada.readLine();
		
		while(linea!=null) {
			String mayus = linea.toUpperCase();
			salida.println(mayus);
			salida.flush();
			linea = entrada.readLine();
			
		}
		System.exit(0);
	}

}
