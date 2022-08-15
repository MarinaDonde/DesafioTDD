package desafioDojo.application;

import java.util.Scanner;

import application.Program;
import desafioDojo.entities.AnoBissexto;

public class Program08 {

	public static void main(String[] args) {
		
		iniciarExe08();
		
	}
	
	public static void iniciarExe08() {

		Scanner sc = new Scanner(System.in);
		
		Program program = new Program();
		AnoBissexto ano = new AnoBissexto();
		
		System.out.print("Insira um ano entre 0 e 9999: ");
		int descobrir = sc.nextInt();
		sc.nextLine();
		
		if (descobrir < 0 || descobrir > 9999) {
			System.out.println("Por favor, tente novamente.");
			System.out.println();
			menuApp();
		} else {
			System.out.println(ano.verificarAno(descobrir));
			System.out.println();
			menuApp();
		}
		
		
	}
	
	public static void menuApp() {
		
		Scanner sc = new Scanner(System.in);
		
		Program program = new Program();
		
		String escolha;
		do {
			System.out.print("Deseja inserir outro ano? s | n ");		
			escolha = sc.nextLine();
			if (escolha.equals("s")) {
				iniciarExe08();
				break;
			} else if (escolha.equals("n")){
				program.main(null);
				break;
			} else {
				System.out.println("Opção inválida, tente novamente.");
			}
		} while (!escolha.equals("s") || !escolha.equals("n"));
		
		sc.close();
	}
}
