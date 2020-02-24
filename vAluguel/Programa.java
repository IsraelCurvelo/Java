package vetor;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		aluguel[] vect = new aluguel[10];
		char resposta;
		System.out.println("Deseja cadastrar  algum quarto? ");
		resposta = sc.next().charAt(0);

		while (resposta == 's') {
			sc.nextLine();
			System.out.print("Nome : ");
			String nome = sc.nextLine();
			System.out.print("Email : ");
			String email = sc.nextLine();
			System.out.print("Quarto : ");
			int quarto = sc.nextInt();

			vect[quarto] = new aluguel(nome, email, quarto);

			System.out.println("Deseja cadastrar  algum quarto? ");
			resposta = sc.next().charAt(0);

		}
		
		System.out.println("Quartos Alugados: ");
		
		for (int i =0; i < vect.length;i++) {
			if (vect[i] != null) {
				System.out.println("----------------------------------------------------------------");
				System.out.println(" ");
				System.out.println("Quarto: " + vect[i].getQuarto());
				System.out.println("Nome : " +  vect[i].getNome() );
				System.out.println("Email : " + vect [i].getEmail() );
					
				
				
			}
		}
		

		sc.close();

	}

}
