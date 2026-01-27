package entities;

public class Conta {
	/*Atributos da classe*/
     public String titular;
     public double saldo;
     public int numeroConta;
     public double saldoConta;
     
     
     public Conta(String titular, int numeroConta,double saldo,double saldoConta) {
    	 this.titular = titular;
    	 this.numeroConta = numeroConta;
    	 this.saldo = saldo;
    	 this.saldoConta = saldoConta;
     /*Logo abaixo os metodos*/
     }
     public void   depositar(double deposito) {
    	 if( deposito > 0) {;
    	     this.saldoConta += deposito;
    		 System.out.printf("Deposito bem sucedido  de: R$%.2f%n",deposito);
    		 
    	 };
     }
     public void sacar(double valor) {
    	 if(this.saldo >= valor) {
    		 this.saldo -= valor;
    		 System.out.printf("Saque de R$ %.2f realizado com sucesso %n",valor);
     }else {
    	System.out.println("Saldo insuficiente");
     }}
     /* Exibi o programa no console mostrando o resultado*/
     public void exibirDados() {
    	 System.out.printf("Nome do titular:%s%n",this.titular);
    	 System.out.printf("Numero da conta:%d%n ", this.numeroConta);
    
    	 
     }
}
