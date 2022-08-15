package exercicio01.application;

import java.util.Scanner;

import application.Program;
import exercicio01.entities.Veiculo;

public class Program01 {

	public static void main(String[] args) {
		
		iniciarExe01();

	}
	
	public static void iniciarExe01() {
		
		Scanner sc = new Scanner(System.in);
		Program program = new Program();
		
		System.out.println("Insira os dados do seu ve�culo: ");
		System.out.print("Qual a marca do seu ve�culo? ");
		String marca = sc.nextLine();
		System.out.print("Qual o modelo do seu ve�culo? ");
		String modelo = sc.nextLine();
		System.out.print("Qual a placa do seu ve�culo? ");
		String placa = sc.nextLine();
		System.out.print("Qual a cor do seu ve�culo? ");
		String cor = sc.nextLine();	
		String opcaoLigado;
		Boolean ligado = null;
		do {
			System.out.print("O seu ve�culo est� ligado? s | n ");
			opcaoLigado = sc.nextLine();
			if (opcaoLigado.equals("s")) {
				ligado = true;
			} else if (opcaoLigado.equals("n")){
				ligado = false;
			} else {
				System.out.println("Op��o inv�lida! Tente novamente...");
			}
		} while (ligado == null);
		System.out.println("Informa��o importante: ");
		System.out.println("O Seu ve�culo possui apenas 5L de combust�vel!");
		
		Veiculo carro = new Veiculo(marca, modelo, placa, cor, ligado, 5, 0);
		
		String menuJogoVeiculo;
		
		carro.menuJogoVeiculo();
		menuJogoVeiculo = sc.nextLine();
		
		do {					
			switch(menuJogoVeiculo) {
			case "0":
				System.out.println("Saindo...");
				program.main(null);
				break;
			case "1":
				System.out.println(carro.ligar());
				carro.menuJogoVeiculo();
				menuJogoVeiculo = sc.nextLine();
				break;
			case "2":
				System.out.println(carro.desligar());
				carro.menuJogoVeiculo();
				menuJogoVeiculo = sc.nextLine();
				break;
			case "3":
				System.out.print("Quantos litros voc� deseja abastecer? ");
				int combustivel = sc.nextInt();
				System.out.println(carro.abastecer(combustivel));
				carro.menuJogoVeiculo();
				menuJogoVeiculo = sc.nextLine();
				break;
			case "4":
				System.out.println(carro.acelerar());
				carro.menuJogoVeiculo();
				menuJogoVeiculo = sc.nextLine();
				break;
			case "5":
				System.out.println(carro.frear());
				carro.menuJogoVeiculo();
				menuJogoVeiculo = sc.nextLine();
				break;
			case "6":
				System.out.print("Qual cor voc� quer pintar? ");
				cor = sc.nextLine();
				System.out.println(carro.pintar(cor));
				carro.menuJogoVeiculo();
				menuJogoVeiculo = sc.nextLine();
				break;
			case "7":
				iniciarExe01();
				break;
			case "8":
				System.out.println(carro.toString());			
				carro.menuJogoVeiculo();
				menuJogoVeiculo = sc.nextLine();
				break;
			default:
				System.out.println("Op��o Inv�lida. Tente novamente...");
				carro.menuJogoVeiculo();
				menuJogoVeiculo = sc.nextLine();	
			}
		} while (!menuJogoVeiculo.equals("0"));
		
		System.out.println("Saindo...");

		program.main(null);
		sc.close();

	}

}
