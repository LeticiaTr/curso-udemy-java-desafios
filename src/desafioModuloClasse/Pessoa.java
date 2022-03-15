package desafioModuloClasse;

public class Pessoa {

	
	  String nome;
	  double peso;
	  
 
	void comer(Comida comidas){
		 this.peso = peso + comidas.peso;
		 
	 }
	
	String apresentar() {
		return "Olá eu sou " +nome+  " e peso " +peso + "KG";
	}
	
}
