package ejercicios;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class GenerarAleatorio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//En este caso solo usamos un proceso (no esta en el while)
		BufferedReader entradaHijo=null;
		String numero,linea;
		//Runtime runtime = Runtime.getRuntime();
		try {
		
		File directorio = new File("bin");
		ProcessBuilder pb = new ProcessBuilder("java","ejercicios.Aleatorio2");
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
			 numero = entradaHijo.readLine();
			 if(numero!=null) {
				System.out.println(numero); 
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
