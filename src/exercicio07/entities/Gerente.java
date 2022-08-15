package exercicio07.entities;

public class Gerente extends Funcionario{

	public Gerente(String nome, Integer idade, Double salario) {
		super(nome, idade, salario);
	}
	
	@Override
	public double bonificacao() {
		return salario + 10000.00;
	}
	
	@Override
	public String toString() {
		return "Gerente " + super.toString();
	}
}
