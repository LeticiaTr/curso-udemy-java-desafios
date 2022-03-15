
public class DesafioLogico {
	
	public static void main(String []args) {
		
		
		boolean trabalho1 = true;
		boolean trabalho2 = false;
		
		boolean tv50 = trabalho1 && trabalho2;
		System.out.println("Compra a tv 50 e shopping "+ tv50);
		
		boolean tv32 = trabalho1 ^ trabalho2;
		System.out.println("Compra a tv 32 "+ tv32);
		
		boolean sorvete = tv50 || tv32;
		System.out.println("VAi tomar sorte "+ sorvete);
		
		boolean casa = !trabalho1 && !trabalho2;
		System.out.println("FIcar em casa "+ casa);
		
		
		
		
		/*if (trabalho1 && trabalho2 == true){
			System.out.println("Compra a tv 50 e shopping");
				
		}else 
		
		if(trabalho1 || trabalho2 == true){
			System.out.println("Compra a tv 32 e shopping");
			
		}else
			System.out.println("Compra a tv");	*/
		
	}

}
