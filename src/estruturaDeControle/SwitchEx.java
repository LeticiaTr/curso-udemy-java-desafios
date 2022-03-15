package estruturaDeControle;

import java.util.Scanner;
public class SwitchEx {
	
	public static void main (String []args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o número da semana mais legall");
		String n = entrada.nextLine();
		
		int n1 =entrada.nextInt();
		int n2 =entrada.nextInt();
		 float soma = n1+n2;
		 
		switch (n) {
		
		
		case "+":
			  soma = n1+n2;
			System.out.println(soma);
			break;
		case "-":
			  soma = n1-n2;
				System.out.println(soma);
			break;
		case "*":
			  soma = n1*n2;
				System.out.println(soma);
			break;
		case "/":
			  soma = n1/n2;
				System.out.println(soma);
			break;
		
			default:
				System.out.println("Número inválido");
				
		}
		entrada.close();
	}
	
	
}
