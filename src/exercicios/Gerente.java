package exercicios;

public class Gerente {

	String nome;
	double salario;
	double aumentoGerente;
	static double aumentoFixo = 0.10;
	
	double  aumentoFixo() {
		return salario * (1+ aumentoFixo);
	}
	
	double aumentoGerente(double aumentoGerente){
		this.aumentoGerente = aumentoGerente;
		return salario * (1 + aumentoGerente);
	}
	
	public static void main(String[] args) {
		

		Gerente s1 = new Gerente();
		s1.nome = "Malory";
		s1.salario = 3500;
		//s1.aumentoGerente = 0.5;

	//	Gerente.aumentoFixo = 3;
		
		
	//	s1.aumentoFixo();
		System.out.printf("Aumento do gerente= "
				+ "%.2f\n" , Gerente.aumentoFixo);
		System.out.printf("Salário sem aumento= "
				+ "%.2f\n" , s1.salario);
		System.out.printf("Aumento fixo + salario= "
				+ "%.2f\n" ,s1.aumentoFixo());
		System.out.printf("Aumento do gerente + salario= "
				+ "%.2f " ,s1.aumentoGerente(1));
		
		
	}

}
