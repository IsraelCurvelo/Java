import java.util.Locale;
import java.util.Scanner;

import entidades.funcionario;

public class Main {

	public static void main(String[] args) {
		
		 Locale.setDefault (Locale.US);
		 Scanner sc = new Scanner (System.in);
		 double porc;
		 
		 funcionario novo = new funcionario ();
		 
		 System.out.println("Digite o nome do Funcionario: ");
		 novo.nome = sc.nextLine();
		 System.out.println("Digite o salario do Funcionario: ");
		 novo.salarioBruto = sc.nextDouble();
		 System.out.println("Digite a taxa mensal do Funcionario: ");
		 novo.taxa = sc.nextDouble();
		 
		 System.out.println("Empregado: "+ novo);
		 System.out.println();
		 System.out.println("Qual a porcentagem a ser aumentada do salario: ");
		 
		 porc = sc.nextDouble();
		 novo.aumentarSalario(porc);
		 
		 System.out.println("Atualizado : " + novo);
		 
		 
		 sc.close();

	}
}

	
