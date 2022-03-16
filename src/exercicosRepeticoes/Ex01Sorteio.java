package exercicosRepeticoes;


import java.util.Scanner;
import java.util.Random;

public class Ex01Sorteio {
	
	
	public static void main (String []args) {
		/*Fazer uma classe Ex2Sorteio para:
		• Sortear um número de 0 a 100 (dica: usar Math.random())
		• Pedir um palpite ao usuário. Se ele errar, informar se o palpite é maior ou
		menor do que o número sorteado.
		• Pedir novos palpites até que o usuário acerte e, depois disso, mostrar em
		quantas tentativas ele acertou. */
		
		
		
		
		Random gerador = new Random();
		int aleatorio = gerador.nextInt(2);
	
		Scanner entrada = new Scanner(System.in);
	
	
		int num = 0;
		int erros= 0;
		int tentativas = erros +1;

		
			 
			
	while (num != aleatorio){
		 
		aleatorio = gerador.nextInt(2);
		System.out.print("Digite um número\n ");
		num = entrada.nextInt();
		System.out.println(aleatorio);
		 
		if (num != aleatorio) {
			if (num < aleatorio) {
				System.out.println("Seu num é menor que o num sorteado");
			}else {
				System.out.println("Seu num é menor que o num sorteado");
				}
			erros = erros + 1;
		}
		 
	}
	
	
	System.out.println("Você errou " + erros + "vezes");
	System.out.println("Você acertou depois de "+tentativas + 
			" tentativas");
	
	entrada.close();
	}

}
