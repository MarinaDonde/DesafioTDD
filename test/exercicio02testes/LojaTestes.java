package exercicio02testes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import exercicio02.entities.Livro;
import exercicio02.entities.Loja;
import exercicio02.entities.VideoGame;

public class LojaTestes {
	
	private List<Livro> livros;
	private List<VideoGame> games;
	private Loja americanas;
	private Livro l3;
	private VideoGame xbox;

	
	@BeforeEach
	public void setup() {
		livros = new ArrayList<Livro>();
		games = new ArrayList<VideoGame>();
		l3 = new Livro("Java POO", 20.0, 50, "GFT", "educativo", 500);
		xbox = new VideoGame("XBOX", 1500.0, 500, "Microsoft", "One", false);
		americanas = new Loja("Americanas", "12345678", livros, games);
	}
	
	@Test
	void deveAddLivro() throws Exception {
		boolean teste = livros.add(new Livro("Java POO", 20.0, 50, "GFT", "educativo", 500));
		assertEquals(true, teste);
	}
	
	@Test
	void deveRetornarFalseCasoALojaEstejaVazia() throws Exception {
		livros.add(l3);
		boolean esperado = livros.isEmpty();
		americanas.listaLivros();
		assertEquals(false, esperado);
	}
	
	@Test
	void deveSomarTodosOsValoresDosProdutosERetornarOTotal() throws Exception{
		livros.add(l3);
		games.add(xbox);
		double esperado = americanas.calculaPatrimonio();
		assertEquals(751000.0, esperado, 0.0001);
	}

}
