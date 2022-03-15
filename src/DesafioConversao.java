import java.util.Scanner;
import java.util.Locale;
public class DesafioConversao {

	public static void main(String [] args) {
		Locale.setDefault(new Locale("en", "US"));
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite seu salário1 ");
		String a = ler.next().replace(",", ".");
		System.out.println("Digite seu salário2 ");
		String b = ler.next().replace(",", ".");
		System.out.println("Digite seu salário3 ");
		String c = ler.next().replace(",", ".");
		
		Double a1 = Double.parseDouble(a);
		Double b2 = Double.parseDouble(b);
		Double c3 = Double.parseDouble(c);
		
		double media = (a1+b2+c3)/3;
		System.out.printf("Seu salário é %.2f ", media);
		
		
		ler.close();
	}
	
	
	
	
}
