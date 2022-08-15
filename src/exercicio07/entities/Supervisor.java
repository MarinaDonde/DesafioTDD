package exercicio07.entities;

public class Supervisor extends Funcionario{

	public Supervisor(String nome, Integer idade, Double salario) {
		super(nome, idade, salario);
	}
	
	@Override
	public double bonificacao() {
		return salario + 5000.00;
	}
	
	@Override
	public String toString() {
		return "Supervisor " + super.toString();
	}
}
