package desafioModuloClasse;

public class Jantar {
	
	public static void main (String []args) {
		
		Pessoa p1 = new Pessoa();
		p1.nome = "Maria";
		p1.peso = 58.5;
		
		Comida c1 = new Comida("Arroz", 0.25);
		
		
		System.out.println(p1.apresentar());
		 p1.comer(c1);
		System.out.println(p1.apresentar());
		
	}

}
