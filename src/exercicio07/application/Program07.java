package exercicio07.application;

import java.util.Locale;
import java.util.Scanner;

import application.Program;
import exercicio07.entities.Gerente;
import exercicio07.entities.Supervisor;
import exercicio07.entities.Vendedor;

public class Program07 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		iniciarExe07();

	}
	
	public static void iniciarExe07() {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Program program = new Program();
		
		String bonus;
		
		System.out.print("Qual o nome do funcionário? ");
		String nome = sc.nextLine();
		System.out.print("Qual a idade do funcionário? ");
		int idade = sc.nextInt();
		System.out.print("Qual o salário do funcionário? ");
		double salario = sc.nextDouble();
		sc.nextLine();
		System.out.println("Informe a função do funcionário: ");
		System.out.print("1- Gerente | 2- Supervisor | 3- Vendedor ");
		String funcao = sc.nextLine();
		
		switch (funcao) {
		case "1":
			Gerente gerente = new Gerente(nome, idade, salario);
			System.out.println("O funcionário " + nome + " deve receber bonificação? s | n");
			bonus = sc.nextLine();
			if (bonus.equals("s")) {
				System.out.println(gerente);
				System.out.printf("Salário com Bônus: %.2f%n", gerente.bonificacao());
			} else {
				System.out.println(gerente);
			}
			break;
		case "2":
			Supervisor supervisor = new Supervisor(nome, idade, salario);
			System.out.println("O funcionário " + nome + " deve receber bonificação? s | n");
			bonus = sc.nextLine();
			if (bonus.equals("s")) {
				System.out.println(supervisor);
				System.out.printf("Salário com Bônus: %.2f%n", supervisor.bonificacao());
			} else {
				System.out.println(supervisor);
			}
			break;
		case "3":
			Vendedor vendedor = new Vendedor(nome, idade, salario);
			System.out.println("O funcionário " + nome + " deve receber bonificação? s | n ");
			bonus = sc.nextLine();
			if (bonus.equals("s")) {
				System.out.println(vendedor);
				System.out.printf("Salário com Bônus: %.2f%n", vendedor.bonificacao());
			} else {
				System.out.println(vendedor);
			}
			break;
		default:
			System.out.println("Opção Inválida. Tente novamente...");
			iniciarExe07();
			break;
		}
		
		System.out.print("Deseja inserir outro funcionário? s | n ");
		String opcao = sc.nextLine();
		
		if (opcao.equals("s")) {
			iniciarExe07();
		} else {
			program.main(null);
		}
		
		sc.close();
	}

}
