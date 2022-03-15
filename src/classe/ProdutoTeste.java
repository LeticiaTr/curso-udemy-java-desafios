package classe;

public class ProdutoTeste {

	public static void main(String[] args) {


		Produto p1 = new Produto();
		p1.nome = "Notebook";
		p1.preco = 4356.89;
		
		
		Produto p2 = new Produto("Caneta Preta", 12.56);
	//	p2.nome = "Caneta Preta";
	//	p2.preco = 12.56;
		
		
		double valorFinal1 = p1.preco * (1- Produto.desconto);
		double valorFinal2 = p2.preco * (1- Produto.desconto);
		
		 p1.precoComDesconto();
		
		System.out.printf("Preço é %.2f\n", valorFinal1);
		System.out.printf("Preço é %.2f\n", valorFinal2);
		
		System.out.printf("Preço é %.2f\n",  p1.precoComDesconto());
		System.out.printf("Preço é %.2f",  p2.precoComDesconto());
		
		
		

	}

}
