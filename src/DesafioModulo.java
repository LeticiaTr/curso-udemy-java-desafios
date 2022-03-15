import java.util.Scanner;
public class DesafioModulo {

	
	public static void main (String [] args) {
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite um número");
		double n1 = ler.nextDouble();
		System.out.println("Digite uma numero");
		double n2 = ler.nextDouble();
		System.out.println("Digite uma operação");
		String ope = ler.next();
	
		double resultado = "+".equals(ope)? n1 + n2:0;
		resultado = "*".equals(ope)? n1 * n2:resultado;
			resultado ="-".equals(ope)? n1 - n2:resultado;
		
		
		
		System.out.printf("%f", resultado);
	
		
		ler.close();		
	}
}
