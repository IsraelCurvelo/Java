package Entidades;

public class Conta {
	private String nome;
	private int agencia;
	private int conta;
	private double saldo;

	public Conta() {
	}

	public Conta(String nome, int agencia, int conta, double saldo) {
		this.nome = nome;
		this.agencia = agencia;
		this.conta = conta;
		this.saldo = saldo;
	}

	public Conta(String nome, int agencia, int conta) {
		this.nome = nome;
		this.agencia = agencia;
		this.conta = conta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAgencia() {
		return agencia;
	}

	public int getConta() {
		return conta;
	}

 	public double getSaldo() {
		return saldo;
	}

	public void fazerDeposito(double valor) {
		this.saldo = this.saldo + valor;

	}

	public void fazerSaque(double valor) {
		this.saldo = this.saldo - valor - 5;
	}

}
