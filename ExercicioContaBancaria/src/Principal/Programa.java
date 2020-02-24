package Principal;

import java.util.Locale;
import java.util.Scanner;

import Entidades.Conta;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String nome;
		int agencia;
		int conta;
		double saldo;

		System.out.println("Sistema de cadastramento bancario ");
		System.out.println("Favor Digitar o nome do Titular da conta: ");

		nome = sc.nextLine();
		System.out.println("Favor Digitar o numero da agencia: ");
		agencia = sc.nextInt();
		System.out.println("Favor Digitar o numero da conta: ");
		conta = sc.nextInt();

		System.out.println("Qual o valor do deposito inicial? ");
		saldo = sc.nextDouble(); 

		Conta a = new Conta(nome, agencia, conta, saldo);

		System.out.println("Dados da conta: ");
		System.out.println("Nome : " + a.getNome());
		System.out.println("Agencia : " + a.getAgencia());
		System.out.println("Conta : " + a.getConta());
		System.out.printf("Saldo : %.2f%n  ", a.getSaldo());
		
		System.out.println("Entre com o valor a ser depositado: ");
		saldo = sc.nextDouble();
		
		a.fazerDeposito(saldo);
		
		System.out.println("Dados da conta ATUALIZADO: ");
		System.out.println("Nome : " + a.getNome());
		System.out.println("Agencia : " + a.getAgencia());
		System.out.println("Conta : " + a.getConta());
		System.out.printf("Saldo : %.2f%n  ", a.getSaldo());
		
		System.out.println("Entre com o valor do saque: ");
		saldo = sc.nextDouble();
		
		a.fazerSaque(saldo);
		
		System.out.println("Dados da conta ATUALIZADO: ");
		System.out.println("Nome : " + a.getNome());
		System.out.println("Agencia : " + a.getAgencia());
		System.out.println("Conta : " + a.getConta());
		System.out.printf("Saldo : %.2f%n  ", a.getSaldo());
		
		

		sc.close();
	}

}
