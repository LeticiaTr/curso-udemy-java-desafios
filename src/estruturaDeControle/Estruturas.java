package estruturaDeControle;
import java.util.Scanner;

public class Estruturas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	int contador = 0;
		
		while (contador <= 10) {
			
			System.out.printf("i = %d \n ", contador );
			
			contador ++;
		}
		
		
		for (contador =0; contador <=10; contador++) {
			
			System.out.printf("\n i = %d \n ", contador );
		}
		*/
		
		
		Scanner ler = new Scanner(System.in);
		
	
		
		String palavra = "";
		
		
		
		
		while (!palavra.equalsIgnoreCase("sair")  ) {
			
			System.out.printf("Escreva " );
			 palavra = ler.next();
		}
		
		System.out.printf("Fim " );
		
		ler.close();
	}

}
