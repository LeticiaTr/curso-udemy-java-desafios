package exercicios;
import java.util.Scanner;
public class Imc {

	
	public static void main (String [] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite seu peso");
		double peso = entrada.nextDouble();
		System.out.println("Digite sua altura");
		double altura = entrada.nextDouble();
		
		double imc  = peso / Math.pow(altura, altura);
		
		System.out.printf("Seu MIC é %.2f ", imc);
		entrada.close();
	}
}
