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
		
		System.out.print("Qual o nome do funcion�rio? ");
		String nome = sc.nextLine();
		System.out.print("Qual a idade do funcion�rio? ");
		int idade = sc.nextInt();
		System.out.print("Qual o sal�rio do funcion�rio? ");
		double salario = sc.nextDouble();
		sc.nextLine();
		System.out.println("Informe a fun��o do funcion�rio: ");
		System.out.print("1- Gerente | 2- Supervisor | 3- Vendedor ");
		String funcao = sc.nextLine();
		
		switch (funcao) {
		case "1":
			Gerente gerente = new Gerente(nome, idade, salario);
			System.out.println("O funcion�rio " + nome + " deve receber bonifica��o? s | n");
			bonus = sc.nextLine();
			if (bonus.equals("s")) {
				System.out.println(gerente);
				System.out.printf("Sal�rio com B�nus: %.2f%n", gerente.bonificacao());
			} else {
				System.out.println(gerente);
			}
			break;
		case "2":
			Supervisor supervisor = new Supervisor(nome, idade, salario);
			System.out.println("O funcion�rio " + nome + " deve receber bonifica��o? s | n");
			bonus = sc.nextLine();
			if (bonus.equals("s")) {
				System.out.println(supervisor);
				System.out.printf("Sal�rio com B�nus: %.2f%n", supervisor.bonificacao());
			} else {
				System.out.println(supervisor);
			}
			break;
		case "3":
			Vendedor vendedor = new Vendedor(nome, idade, salario);
			System.out.println("O funcion�rio " + nome + " deve receber bonifica��o? s | n ");
			bonus = sc.nextLine();
			if (bonus.equals("s")) {
				System.out.println(vendedor);
				System.out.printf("Sal�rio com B�nus: %.2f%n", vendedor.bonificacao());
			} else {
				System.out.println(vendedor);
			}
			break;
		default:
			System.out.println("Op��o Inv�lida. Tente novamente...");
			iniciarExe07();
			break;
		}
		
		System.out.print("Deseja inserir outro funcion�rio? s | n ");
		String opcao = sc.nextLine();
		
		if (opcao.equals("s")) {
			iniciarExe07();
		} else {
			program.main(null);
		}
		
		sc.close();
	}

}
