package estruturaDeControle;

public class Switch {
	
	public static void main (String [] args) {
		
		int num = 82;
		int div =1;
		int c = 1;
		
		
		for (; c<=num; c++) {
		
			
			if (num <= 0) {	
				System.out.printf("\n O número %d é negativo ou menor que"
						+ "zeo", num);
			
			} else if (num % div == 0 ){
			div++;	
			}
			
		}
		
		if(div>= 3) {
			System.out.printf("\n O número %d Não é primo", num);
		}else if (div>=1 && div <3){
			System.out.printf("\n O número %d É primo", num);
		}
		
		else {
			System.out.printf("\n O número %d é negativo ou menor que"
					+ "zeo", num);}
		
		
		
	}
	
	
}
