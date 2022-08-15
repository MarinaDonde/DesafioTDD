package application;

import java.util.Scanner;

import desafioDojo.application.Program08;
import exercicio01.application.Program01;
import exercicio02.application.Program02;
import exercicio03.application.Program03;
import exercicio07.application.Program07;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Program01 exe01 = new Program01();
		Program02 exe02 = new Program02();
		Program03 exe03 = new Program03();
		Program07 exe07 = new Program07();
		Program08 exe08 = new Program08();
		
		System.out.println();
		System.out.println("************************************************");	
		System.out.println("*                  Desafio TDD                 *");
		System.out.println("*         [0] Para Sair do Programa            *");
		System.out.println("*       [1] Para Acessar o Exercício 01        *");
		System.out.println("*       [2] Para Acessar o Exercício 02        *");
		System.out.println("*       [3] Para Acessar o Exercício 03        *");
		System.out.println("*       [7] Para Acessar o Exercício 07        *");
		System.out.println("*       [8] Para Acessar o Desafio Dojo        *");
		System.out.println("************************************************");	
		System.out.print("Escolha uma opção acima: ");
		String opcao = sc.nextLine();
		System.out.println();
		
		switch(opcao) {
		case "0":
			System.out.println("Saindo...");
			//System.out.println();
			System.exit(0);
			break;
		case "1":
			exe01.iniciarExe01();
			break;
		case "2":
			exe02.iniciarExe02();
			break;
		case "3":
			exe03.iniciarExe03();
			break;
		case "7":
			exe07.iniciarExe07();
			break;
		case "8":
			exe08.iniciarExe08();
			break;
		default:
			System.out.println("Insira 0 para sair ou tente novamente");
			break;
		}
		
		sc.close();

	}

}
