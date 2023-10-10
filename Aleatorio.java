package ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Random;
public class Aleatorio {

	
	public static void main(String[] args) throws IOException {
		/*Random rdm = new Random();
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintStream ps = new PrintStream(System.out);
		while(in.readLine()!=null) {
			int numero = rdm.nextInt(11);
			ps.print(numero);
			ps.flush();
			
		}
		System.exit(0);*/
		//int ran = (int)(Math.random()*100+1)-1;
		Random ran = new Random();
		int n = ran.nextInt();
		System.out.println(n);
		
		
	}

}
