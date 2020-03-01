
public class Operacao {
	private double numberOne;
	private double numberTwo;
	private double resultado;

	public Operacao() {

	}

	public Operacao(double numberOne, double numberTwo) {

		this.numberOne = numberOne;
		this.numberTwo = numberTwo;
	}

	public double getNumberOne() {
		return numberOne;
	}

	public void setNumberOne(double numberOne) {
		this.numberOne = numberOne;
	}

	public double getNumberTwo() {
		return numberTwo;
	}

	public void setNumberTwo(double numberTwo) {
		this.numberTwo = numberTwo;
	}

	public double getResultado() {
		return resultado;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}

	public void somar(double num1, double num2) {
		double res = num1 + num2;
		System.out.println("O resultado da soma é: " + res);
		this.resultado = res;

	}

	public void subtrair(double num1, double num2) {
		double res = num1 - num2;
		System.out.println("O resultado da subtração é: " + res);
		this.resultado = res;
	}

	public void multiplicar(double num1, double num2) {
		double res = num1 * num2;
		System.out.println("O resultado da multiplicacão é: " + res);
		this.resultado = res;
	}

	public void dividir(double num1, double num2) {
		double res = num1 / num2;
		System.out.println("O resultado da divisão é: " + res);
		this.resultado = res;
	}

	public void logaritmo(double num1) {
		double res = Math.log10(num1);
		System.out.println("O resultado é: " + res);
		this.resultado = res;
	}

	public void logaritmoNep(double num1) {
		double res = Math.log1p(num1);
		System.out.println("O resultado é: " + res);
		this.resultado = res;
	}

	public void raizNMesima(double num1, double num2) {
		double res = Math.pow(num1, 1 / num2);
		System.out.println("O resultado é: " + res);
		this.resultado = res;
	}

	public void inverso(double num1) {
		double res = 1 / num1;
		System.out.println("O resultado é: " + res);
		this.resultado = res;
	}

	public void fatorial(double num1) {
		double numero = num1;
		double fat = num1;
		while (numero > 1) {
			fat = fat * (numero - 1);
			numero--;
		}
		System.out.println("O fatorial é: " + fat);
		this.resultado = fat;
	}

	public void potencia(double num1, double num2) {
		double res = Math.pow(num1, num2);
		System.out.println("O resultado é: " + res);
		this.resultado = res;
	}

}