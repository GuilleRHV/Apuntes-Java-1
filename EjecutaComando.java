package ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class EjecutaComando {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if(args.length<1){
			System.out.println("Se necesita algún argumento para ejecutar el programa");
			System.exit(-1);
		}
		
		
		Runtime runtime = Runtime.getRuntime();
		try{
			Process process = runtime.exec(args);
			BufferedReader br = new BufferedReader(new InputStreamReader(process.getErrorStream()));
			String line="";
			while((line =br.readLine())!=null) {
				System.out.println(line);
			}
			
		}
		catch (IOException ex){
			System.err.println("Error of running " +Arrays.toString(args)+", no se reconoce como un comando interno o externo,\r\n"
					+ "programa o archivo por lotes ejecutable.\r\n"
					+ "");
			
		}
	}

}
