package desafioModuloClasse;

public class Pessoa {

	
	  String nome;
	  double peso;
	  
 
	void comer(Comida comidas){
		 this.peso = peso + comidas.peso;
		 
	 }
	
	String apresentar() {
		return "Ol� eu sou " +nome+  " e peso " +peso + "KG";
	}
	
}
