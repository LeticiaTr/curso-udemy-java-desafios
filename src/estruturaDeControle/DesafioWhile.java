package estruturaDeControle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner escreva = new Scanner(System.in);
		
		double nota = 0;
		double total =0;
		int quantNotas = 0;
		
		while(nota != -1) {
			System.out.print("Digite uma nota");
			nota = escreva.nextDouble();
			
			if (nota >=0 && nota <= 10) {
			total = total + nota;
			quantNotas = quantNotas + 1;
			
			}

			
		}
		
		System.out.printf("Total é %.2f ", total);
		System.out.printf("QuantNotas %d", quantNotas);
		
		
	escreva.close();
	
	
	/*	
		OUTRA MANEIRA
		float nota = 0;
		float total=0;
		float totalNotas=0;
		float notaValida= 0;
		
		
		
			while (nota != -1) {
				System.out.println("Digite uma nota");
				 nota = ler.nextInt();
			
				totalNotas++;
				if (nota >=0 && nota <=10) {
					total = total + nota;
					notaValida++;
					
					
					
					}else {
					System.out.println("Nota inválida");
						/*System.out.println("\nDigite uma nota");
						 nota = ler.nextInt();
			}
			}
			 
			
		double media = total / notaValida;
		System.out.printf("Media = %.2f " , media);
		System.out.printf("\nNotas válidas %.1f = " , notaValida);
		System.out.printf("\nTotal de notas %.1f = " , totalNotas);
		
	}
	*/
	
	
	}

}
