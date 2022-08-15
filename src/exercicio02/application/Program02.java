package exercicio02.application;

import java.util.ArrayList;
import java.util.List;

import application.Program;
import exercicio02.entities.Livro;
import exercicio02.entities.Loja;
import exercicio02.entities.VideoGame;


public class Program02 {

	public static void main(String[] args) {
		
		iniciarExe02();
		
	}
	
	public static void iniciarExe02() {
		
		Program program = new Program();

		Livro l1 = new Livro("Harry Potter", 40.0, 50, "J. K. Rowling", "fantasia", 300);
		Livro l2 = new Livro("Senhor dos Anéis", 60.0, 30, "J. R. R. Tolkien", "fantasia", 500);
		Livro l3 = new Livro("Java POO", 20.0, 50, "GFT", "educativo", 500);
		
		VideoGame ps4 = new VideoGame("PS4", 1800.0, 100, "Sony", "Slim", false);
		VideoGame ps4usado = new VideoGame("PS4", 1000.0, 7, "Sony", "Slim", true);
		VideoGame xbox = new VideoGame("XBOX", 1500.0, 500, "Microsoft", "One", false);
				
		List<Livro> livros = new ArrayList<>();
		livros.add(l1);
		livros.add(l2);
		livros.add(l3);
			
		List<VideoGame> games = new ArrayList<>();
		games.add(ps4);
		games.add(ps4usado);
		games.add(xbox);
		
		Loja americanas = new Loja("Americanas", "12345678", livros, games);
			
		//Impressões
		System.out.println(l2.calculaImposto());
		System.out.println(l3.calculaImposto());
		System.out.println(ps4usado.calculaImposto());
		System.out.println(ps4.calculaImposto());

		System.out.println("-----------------------------------------------------------------");
		
		americanas.listaLivros();
		
		System.out.println("-----------------------------------------------------------------");
		
		americanas.listaVideoGames();
		
		System.out.println("-----------------------------------------------------------------");
		
		System.out.println(americanas.calculaPatrimonio());
		
		program.main(null);
	}

}
