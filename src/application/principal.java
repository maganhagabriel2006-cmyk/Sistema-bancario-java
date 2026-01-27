package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class principal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Digite o nome do titular");
		String titular = scanner.nextLine();
		System.out.println("Digite o numero da conta");
		int numeroConta = scanner.nextInt();
		System.out.println("Digite o saldo");
		double saldo = scanner.nextDouble();
		System.out.println("Deposite um valor");
		double saldoConta = scanner.nextDouble();
		Conta conta = new Conta(titular, numeroConta,saldo,saldoConta);
        
		if(conta.saldo == conta.saldoConta) {
		System.out.printf("Valor depositado: R$%.2f%n",conta.saldo);
		conta.depositar(saldo);
		}
		System.out.printf("total saldo na conta: R$%.2f%n ", conta.saldoConta);
		System.out.println("Digite um valor para saque:");
		double valor = scanner.nextDouble();
		conta.sacar(valor);
		
		
		conta.exibirDados();
		scanner.close();
		/* Esse programa solicita o nome do titular,numero da conta 
		 * o valor q esta na conta e quanto quer depositar
		 * e o valor que foi sacado
		 */
		
		
	}

}
