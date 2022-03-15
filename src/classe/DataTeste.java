package classe;

public class DataTeste {

	public static void main(String[] args) {
	
		
		Data d1 = new Data();
		//d1.dia =01;
	//	d1.mes = 01;
	//	d1.ano = 1990;
		
		Data d2 = new Data(22,03,1989);
	//	d2.dia = 07;
	//	d2.mes = 05;
	//	d2.ano = 1984;
		
		
		System.out.println( d1.obterDataFormatada());
		System.out.printf("%d/%d/%d" , d2.dia, d2.mes ,d2.ano);
		
		
		

	}

}
