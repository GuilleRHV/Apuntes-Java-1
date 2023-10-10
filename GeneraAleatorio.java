package ejercicios;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Arrays;
import entrada.Teclado;

public class GeneraAleatorio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader entradaHijo=null;
		//Runtime runtime = Runtime.getRuntime();
		try {
		
		File directorio = new File("bin");
		ProcessBuilder pb = new ProcessBuilder("java","ejercicios.Aleatorio");
		pb.directory(directorio);
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		String linea, numero;
		System.out.println("Introduce algo");
		linea = teclado.readLine();
		while(!linea.equals("fin")) {
			Process hijo = pb.start();
			 entradaHijo = new BufferedReader(new InputStreamReader(hijo.getInputStream()));
			numero = entradaHijo.readLine();
			
			if(numero!=null) {
				System.out.println(numero);
			}else {
				System.out.println("SIn datos hijos");
			}
			
			System.out.println("Escribe algo");
			linea = teclado.readLine();
		}
		
		
	}
		
		catch (IOException ex){
			System.err.println(ex.getMessage());
			ex.printStackTrace();
			
		}
		finally {
			try {
				if(entradaHijo!=null) {
					entradaHijo.close();
				}
				
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}

}
