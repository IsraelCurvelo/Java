
import java.util.Locale;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int a;
		double numberOne, numberTwo;
		Operacao calculadora = new Operacao();
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		do {
			System.out.println("\nDigite o Numero da opera��o desejada:\n" + "1- SOMA\n" + "2- SUBTRA��O\n"
					+ "3- MULTIPLICA��O\n" + "4- DIVIS�O\n" + "5- LOGARITMO\n" + "6- LOGARITMO NEPERIANO\n"
					+ "7- RAIZ N-�SIMA\n" + "8- INVERSO\n" + "9- FATORIAL\n" + "10-POT�NCIA\n" + "11-SAIR");
			a = sc.nextInt();
			switch (a) {
			case 1:
				System.out.println("SOMA\n" + "Digite o primeiro n�mero:");

				numberOne = sc.nextDouble();
				calculadora.setNumberOne(numberOne);
				System.out.println("Digite o segundo n�mero:");
				numberTwo = sc.nextDouble();
				calculadora.setNumberTwo(numberTwo);
				calculadora.somar(numberOne, numberTwo);

				break;

			case 2:
				System.out.println("SUBTRA��O\n" + "Digite o primeiro n�mero:");
				numberOne = sc.nextDouble();
				calculadora.setNumberOne(numberOne);
				System.out.println("Digite o segundo n�mero:");
				numberTwo = sc.nextDouble();
				calculadora.setNumberTwo(numberTwo);
				calculadora.subtrair(numberOne, numberTwo);
				break;

			case 3:
				System.out.println("MULTIPLICA��O\n" + "Digite o primeiro n�mero:");
				numberOne = sc.nextDouble();
				calculadora.setNumberOne(numberOne);
				System.out.println("Digite o segundo n�mero:");
				numberTwo = sc.nextDouble();
				calculadora.setNumberTwo(numberTwo);
				calculadora.multiplicar(numberOne, numberTwo);
				break;

			case 4:
				System.out.println("DIVIS�O\n" + "Digite o primeiro n�mero:");
				numberOne = sc.nextDouble();
				calculadora.setNumberOne(numberOne);
				System.out.println("Digite o segundo n�mero:");
				numberTwo = sc.nextDouble();
				calculadora.setNumberTwo(numberTwo);
				calculadora.dividir(numberOne, numberTwo);
				break;

			case 5:
				System.out.println("LOGARITMO\n" + "Digite um n�mero:");
				numberOne = sc.nextDouble();
				calculadora.setNumberOne(numberOne);
				calculadora.logaritmo(numberOne);
				break;

			case 6:
				System.out.println("LOGARITMO NEPERIANO\n" + "Digite um n�mero:");
				numberOne = sc.nextDouble();
				calculadora.setNumberOne(numberOne);
				calculadora.logaritmoNep(numberOne);
				break;

			case 7:
				System.out.println("RAIZ E-N�SIMA\n" + "Digite o primeiro n�mero:");
				numberOne = sc.nextDouble();
				calculadora.setNumberOne(numberOne);
				System.out.println("Digite o segundo n�mero:");
				numberTwo = sc.nextDouble();
				calculadora.setNumberTwo(numberTwo);
				calculadora.raizNMesima(numberOne, numberTwo);
				break;

			case 8:
				System.out.println("INVERSO\n" + "Digite um n�mero:");
				numberOne = sc.nextDouble();
				calculadora.setNumberOne(numberOne);
				calculadora.inverso(numberOne);
				break;

			case 9:
				System.out.println("FATORIAL\n" + "Digite um n�mero:");
				numberOne = sc.nextDouble();
				calculadora.setNumberOne(numberOne);
				calculadora.fatorial(numberOne);
				break;
				
			case 10:
				System.out.println("POT�NCIA\n" + "Digite o primeiro n�mero:");
				numberOne = sc.nextDouble();
				calculadora.setNumberOne(numberOne);
				System.out.println("Digite o segundo n�mero:");
				numberTwo = sc.nextDouble();
				calculadora.setNumberTwo(numberTwo);
				calculadora.potencia(numberOne, numberTwo);
				
				break;
				
			case 11:
				System.out.println("SAINDOOO!!!");
				break;

			default:
				System.out.println("OP��O INVALIDA, REDIGITE POR FAVOR!!! :) ");
				break;

			}

		} while (a < 11 || a>11);

		sc.close();
	}

}
