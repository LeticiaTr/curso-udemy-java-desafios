package estruturaDeControle;

import java.util.Scanner;

public class XuxaPatinhosWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		System.out.printf(" Quantos patinhos tem na motanha?");
		int patinhos = ler.nextInt();
		int contador = 0;
		
		//int patinhoss = patinhos;
		
		while (patinhos >= 1) {
			 //patinhoss = patinhos;
			
			System.out.printf(" %d patinhos foram passear\r\n"
					+ "Além das montanhas\r\n"
					+ "Para brincar\r\n", patinhos);
			
			//patinhos++;
			patinhos--;
			
			
			System.out.printf("A mamãe gritou: "
					+ "Quá, quá, quá, quáMas só %d patinhos "
					+ "voltaram de lá.", patinhos);
			
			contador = contador +1;
		}
		
		System.out.printf("\r\n"
				+ "A mamãe patinha foi procurar\r\n"
				+ "Além das montanhas\r\n"
				+ "Na beira do mar\r\n"
				+ "A mamãe gritou: Quá, quá, quá, quá\r\n"
				+ "E os %d patinhos voltaram de lá.", contador);
		
		
		ler.close();

	}

}
