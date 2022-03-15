package estruturaDeControle;

import java.util.Scanner;

public class ImparWhile {
	
	public static void main(String []args) {
		
		Scanner ler = new Scanner(System.in);
	//	boolean notaValida = false;
	//	int n =1;
		 
		
	/*	if (n%2==0) {
			
			System.out.print("par"+n);
		}else
			System.out.print("impar");*/
			
		
	
	 
				
				/*while ( n >=1 && n <=100){
					
					if (n%2==1 ){
						System.out.printf(" %d impar",n);
						n++;}
						 if (n%2==0) {
							System.out.printf("\n %d par\n",n);
					
					n++;}
					}*/
						
			
		/* do {
			
			System.out.printf("Digite nota");
			int nota = ler.nextInt();
		
			
			if( nota >=0 && nota <=10) {
				notaValida = true;
				System.out.printf("NOta valida");
			}else {
				System.out.printf("NOta invalida");
			}
		}
		
		while(!notaValida);
		
			ler.close();	
		}
		
	}*/
		/*double nota;
		int  contador =1;
		double soma =0;
		double media =0;
		
		
		while (contador <4) {
			
			System.out.printf("\nnota ");
			nota = ler.nextDouble();
			 soma = soma + nota ;
		      media = soma /3;
			contador++;
			
		}	
		 
		
		System.out.printf("Media é %.2f " , media );*/
		
	/*System.out.print("Digite um número \n");
		
		int num = ler.nextInt();
		int contador = 1;
		
		while (contador <=10)	{
			
			int soma = num + contador;
			System.out.printf("\nN %d + %d "
					+ "= %d ", num,contador, soma );
			contador++;
		}*/
		
/*	System.out.printf(" Entre com o número :\n"); ;
		
		int contador = 1;

		while (contador <=7) {
			int num = ler.nextInt();
			if (num >12 && num <20) {
				System.out.printf("Número válido %d " , num);
				break;		
			}else {
			System.out.printf("Número Invalido\n");
			contador++;
			
			}
			
		}*/
		
	     
	     /*
		
		int idade = 0;
		String sexo = "";
		double salario = 0;
		int maiorIdade = 0;
		int menorIdade = 200;
		int sexoMulher = 0;
		double menorSalario= 500000000;
		
	     
	     
	    
	     double mediaSalario =0 ;
	     int totalHabitantes =0;
	     double soma=0;
	     int  menorIdadeSalario = 200;
	     String  sexoMenorSalario = "";
	     
		while (idade >=0) {
			
		
			System.out.println("Informe sua idade");
			idade = ler.nextInt();
			
			if(idade<0) {
				
				break;
				
			}
			
			if (idade >=0) {
				
				
				System.out.println("Informe seu salario");
				salario = ler.nextDouble();
				System.out.println("Informe seu sexo");
				sexo = ler.next();
			
				soma = salario +soma;
				
				totalHabitantes = totalHabitantes +1;
				mediaSalario = soma/totalHabitantes;
				
			
				if (sexo.equalsIgnoreCase("f")) {
					sexoMulher= sexoMulher +1;
				}
			
				if(idade > maiorIdade) {
				  maiorIdade =idade;
		         }
				if(idade < menorIdade){
		    	  menorIdade= idade;
		       } if(salario<menorSalario) {
		    	   menorSalario =salario;
		    	  menorIdadeSalario = idade;
		    	   sexoMenorSalario = sexo;
		    	   
		       }
					
		}
		
		
	}
		
			System.out.println("Habitantes = " + totalHabitantes);
			System.out.println("Maior idade = " + maiorIdade);
		    System.out.println("Menor idade =" + menorIdade);
		    System.out.println("Menor Salário = " + menorSalario);
		    System.out.println("Menor Idade Salario = " +  menorIdadeSalario);
		    System.out.println("Menor Sexo Salario = " +  sexoMenorSalario);
			System.out.println("salario Medio = " + mediaSalario);
			System.out.println("Quantidade de Mulheres = " + sexoMulher);*/
		
		
		
		
	//	int notaValida  = 0; //true; // ou false
		
		/*do {
			
			System.out.printf("\nDigite nota\n");
			int nota = ler.nextInt();
		
			
			if( nota >=0 && nota <=10) {
				notaValida = false; // ou true
				System.out.printf("NOta valida\n");
			}else {
				System.out.printf("NOta invalida\n");
			}
		}
		
		while(notaValida); // ou !notaValida*/
		
		
		
		float nota = 0;
		float total=0;
		float totalNotas=0;
		float notaValida= 0;
		
		
		
			while (nota != -1) {
				System.out.println("Digite uma nota");
				 nota = ler.nextInt();
			
				totalNotas++;
				if (nota >=0 && nota <=10) {
					total = total + nota;
					notaValida++;
					
					
					
					}else {
					System.out.println("Nota inválida");
						/*System.out.println("\nDigite uma nota");
						 nota = ler.nextInt();*/
			}
			}
			 
			
		double media = total / notaValida;
		System.out.printf("Media = %.2f " , media);
		System.out.printf("\nNotas válidas %.1f = " , notaValida);
		System.out.printf("\nTotal de notas %.1f = " , totalNotas);
		
		
		ler.close();
	}
	
}
	



		
			
			
			
		
