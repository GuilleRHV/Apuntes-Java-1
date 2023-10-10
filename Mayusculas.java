package ejercicios;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Mayusculas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader entradaHijo=null;
		String mayus,linea;
		//Runtime runtime = Runtime.getRuntime();
		try {
		
		File directorio = new File("bin");
		ProcessBuilder pb = new ProcessBuilder("java","ejercicios.PasaMayusculas");
		pb.directory(directorio);
		Process hijo = pb.start();
		
		 entradaHijo = new BufferedReader(new InputStreamReader(hijo.getInputStream()));
		 PrintStream salidaHijo = new PrintStream(hijo.getOutputStream());
		 BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		 
		 System.out.println("Escribe una cadena");
		 linea = teclado.readLine();
		 
		 
		 while(!linea.equals("fin")) {
			 
			 salidaHijo.println("");
			 salidaHijo.flush(); //Asegura que los datos se han enviado
			 mayus = entradaHijo.readLine();
			 if(mayus!=null) {
				System.out.println(mayus); 
			 }
			 System.out.println("Escribe algo");
			 linea = teclado.readLine();
		 }
		hijo.destroy();
		
		
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
