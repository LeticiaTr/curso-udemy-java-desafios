package exercicosRepeticoes;


import java.util.Scanner;
import java.util.Random;

public class Ex01Sorteio {
	
	
	public static void main (String []args) {
		/*Fazer uma classe Ex2Sorteio para:
		� Sortear um n�mero de 0 a 100 (dica: usar Math.random())
		� Pedir um palpite ao usu�rio. Se ele errar, informar se o palpite � maior ou
		menor do que o n�mero sorteado.
		� Pedir novos palpites at� que o usu�rio acerte e, depois disso, mostrar em
		quantas tentativas ele acertou. */
		
		
		
		
		Random gerador = new Random();
		int aleatorio = gerador.nextInt(2);
	
		Scanner entrada = new Scanner(System.in);
	
	
		int num = 0;
		int erros= 0;
		int tentativas = erros +1;

		
			 
			
	while (num != aleatorio){
		 
		aleatorio = gerador.nextInt(2);
		System.out.print("Digite um n�mero\n ");
		num = entrada.nextInt();
		System.out.println(aleatorio);
		 
		if (num != aleatorio) {
			if (num < aleatorio) {
				System.out.println("Seu num � menor que o num sorteado");
			}else {
				System.out.println("Seu num � menor que o num sorteado");
				}
			erros = erros + 1;
		}
		 
	}
	
	
	System.out.println("Voc� errou " + erros + "vezes");
	System.out.println("Voc� acertou depois de "+tentativas + 
			" tentativas");
	
	entrada.close();
	}

}
