package exercicio07.entities;

public class Vendedor extends Funcionario{

	public Vendedor(String nome, Integer idade, Double salario) {
		super(nome, idade, salario);
	}
	
	@Override
	public double bonificacao() {
		return salario + 3000.00;
	}
	
	@Override
	public String toString() {
		return "Vendedor " + super.toString();
	}

}
