package exercicios;

public class Conta {

	
	int numeroConta;
	double saldo;
	double limite;
	
	
	Conta(int numeroConta, double saldo, double limite){
		this.numeroConta = numeroConta;
		this.saldo = saldo;
		this.limite = limite;
	}
	
	

	void depositar(double deposito) {
		this.saldo = this.saldo +deposito;
		
	}
	
	void sacar(double saque){
		this.saldo = this.saldo - saque;
		
	}
	
      void extrato() {
    	  System.out.println("A conta " +numeroConta
    	  		+ " O saldo é " +this.saldo );
      }
      
      double saldoDisponivel() {
    	  return this.saldo + this.limite;
      }
	
	
	
	public static void main (String []args) {
		
		Conta a1 = new Conta(2002, 35000, 10000);
		
		a1.depositar(100);
		a1.extrato();
		
		a1.sacar(20000);
		a1.extrato();
		
		System.out.println("Saldo disponível "+a1.saldoDisponivel());
		
		
		
	}
}
