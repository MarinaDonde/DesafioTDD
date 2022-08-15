package exercicio07.entities;

public class Funcionario {
	
	protected String nome;
	protected Integer idade;
	protected Double salario;
	
	public Funcionario(String nome, Integer idade, Double salario) {
		this.nome = nome;
		this.idade = idade;
		this.salario = salario;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	public double bonificacao() {
		return salario;
	}

	@Override
	public String toString() {
		return "[Nome = " + nome + ", idade = " + idade + ", salário = " + String.format("%.2f", salario) + "]";
	}
}
