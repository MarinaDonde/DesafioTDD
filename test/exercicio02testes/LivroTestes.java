package exercicio02testes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import exercicio02.entities.Livro;

public class LivroTestes {
	
	private Livro livro;
	
	@Test
	void deveCriarObjetoLivro() throws Exception {
		livro = new Livro("Harry Potter", 40.0, 50, "J. K. Rowling", "fantasia", 300);
	}
	
	@Test
	void deveVerificarSeOLivroForEducativoNaoCobrarImposto() throws Exception {
		livro = new Livro("Java POO", 20.0, 50, "GFT", "educativo", 500);
		String nome = livro.getNome();
		String esperado = livro.calculaImposto();
		assertEquals("Livro educativo não tem imposto: " + nome + ".", esperado);
	}
	
	@Test
	void deveCalcularOImpostoDoLivro() throws Exception {
		livro = new Livro("Harry Potter", 40.0, 50, "J. K. Rowling", "fantasia", 300);
		String nome = livro.getNome();
		Double preco = livro.getPreco();
		String esperado = livro.calculaImposto();
		assertEquals("R$ " + preco * 0.10 + " de impostos sobre o livro " + nome + ".", esperado);
	}
	
}
