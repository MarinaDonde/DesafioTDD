package exercicio02testes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import exercicio02.entities.VideoGame;

public class VideoGameTestes {
	
	private VideoGame ps4;
	
	@Test
	void deveCriarObjetoVideoGame() throws Exception {
		ps4 = new VideoGame("PS4", 1800.0, 100, "Sony", "Slim", false);
	}
	
	@Test
	void deveVerificarSeOVideoGameForUsadoECobrarImposto() throws Exception {
		ps4 = new VideoGame("PS4", 1800.0, 100, "Sony", "Slim", true);
		String nome = ps4.getNome();
		String modelo = ps4.getModelo();
		double preco = ps4.getPreco();
		String esperado = ps4.calculaImposto();
		assertEquals("Imposto " + nome + " " + modelo + " usado, R$ " + preco * 0.25 + ".", esperado);
	}
	
	@Test
	void deveVerificarSeOVideoGameForNovoECobrarImposto() throws Exception {
		ps4 = new VideoGame("XBOX", 1500.0, 500, "Microsoft", "One", false);
		String nome = ps4.getNome();
		String modelo = ps4.getModelo();
		double preco = ps4.getPreco();
		String esperado = ps4.calculaImposto();
		assertEquals("Imposto " + nome + " " + modelo + " R$ " + preco * 0.45 + "." , esperado);
	}

}
