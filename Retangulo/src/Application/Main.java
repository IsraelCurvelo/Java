package Application;
import java.util.Locale;
import java.util.Scanner;
import Entities.Retangulo;

public class Main {
	

		public static void main(String[] args) {
			
			Locale.setDefault(Locale.US);		
			Scanner sc = new Scanner (System.in);
						
			Retangulo dados = new Retangulo();
			
			System.out.println("Digite a largura do triangulo: ");
			
			dados.largura = sc.nextDouble();
			
			System.out.println("Digite a altura do triangulo: ");
			dados.altura = sc.nextDouble();
			
			System.out.println("A area do triangulo eh: " + dados.area());			
			System.out.println("O perimetro do triangulo eh: " + dados.perimetro());			
			System.out.println("O diagonal do triangulo eh: " + dados.diagonal());
			
			sc.close();
	}

}
