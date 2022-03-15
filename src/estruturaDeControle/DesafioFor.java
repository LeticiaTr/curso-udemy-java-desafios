package estruturaDeControle;

import java.util.Scanner;

public class DesafioFor {
	
	public static void main (String []args) {
		
		
		
		 //Contador de 10 até 0
		/*for(int contador = 10 ; contador >=0; contador = contador -2) {
		System.out.println("C = " + contador);
		}*/
		
		
	/*	String valor = "|";
		
		for(int i=1; i<=5;i++) {
			System.out.println(valor);
			valor = valor + "|";
			
		}*/
		
		
		/*DESAFIO SEM USAR VALORES NÚMERICOS REFAÇA O EX ACIMA
		for(String valor = "|" ; !valor.equalsIgnoreCase("||||||") ; valor = valor + "|") {
		System.out.println(valor);
	
		}*/
		
		Scanner entrada = new Scanner(System.in);
		
	     float mediaGeral= 0;
		float nota1, nota2,media;
		String nome = "";
		float maiorMedia = 0;
		float menorMedia =30;
		
		
		for (int c = 0; c <3; c++) {
		
			
			
			System.out.println("\nDigite nome do aluno ");
			 nome = entrada.next();
			System.out.println("Digite nota 1");
			 nota1 = entrada.nextFloat();
			
			System.out.println("Digite nota 2");
			 nota2 = entrada.nextFloat();
			
			media = (nota1 + nota2)/2;
			
			System.out.printf("Aluno(a) %s \n", nome );
			System.out.printf("Média = %.2f \n", media);
			mediaGeral = (mediaGeral + media);
			
			
			if(media > maiorMedia) {
				maiorMedia = media;
			}
			
			if (media < menorMedia) {
				menorMedia = media;
			}
			
			
			
			if (media>=6 ) {
				System.out.printf("Aluno aprovado! Média = %.2f\n", media);
				}else {
					System.out.printf("Aluno reprovado! Média = %.2f\n", media);
			    }
			
			
		
		}
		
		
		mediaGeral = mediaGeral /3;
	
		System.out.printf("A média geral da turma é = %.2f\n", mediaGeral);
		System.out.printf("A mmaior média da turma  é = %.2f\n", maiorMedia);
		System.out.printf("A menor média da turma é = %.2f\n", menorMedia);
		
		
	
		entrada.close();
		
		
}

	
	
}
