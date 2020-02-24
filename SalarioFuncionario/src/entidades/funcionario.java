package entidades;

public class funcionario {

	public String nome;
	public double salarioBruto;
	public double taxa;
	
	public double calcularSalario() {
		return salarioBruto - taxa;
	}
	
	public void aumentarSalario (double porc) {
		
	salarioBruto = salarioBruto + (salarioBruto * porc/100.0) ;
	}
	
	public String toString() {
		return nome + ", $ " + String.format("%.2f", calcularSalario());
		}
		
	}


