package exercicios;

public class ConversaoGrau {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double celsius = 37;
		
		double faren = celsius * 1.8 +32;
		
		System.out.printf("A conversao de "
				+ "Celsius para Fahrenheit � %.2f\n", faren);
		
		 celsius  = (faren - 32) / 1.8;
		
		System.out.printf("A conversao de "
				+ "Fahrenheit para Celsius � %.2f", celsius );
	}

}
