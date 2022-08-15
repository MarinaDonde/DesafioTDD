package exercicio07testes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import exercicio07.entities.Gerente;

public class GerenteTeste {
	
	private Gerente gerente;
	
	@Test
	public void deveCriarObjetoGerente() throws Exception {
		gerente = new Gerente("Ana", 38, 7000.00);
	}
	
	@Test
	public void deveHerdarMetodoBonificacaoERetornarValorAdicional() throws Exception {
		gerente = new Gerente("Ana", 38, 7000.00);
		double valor = gerente.bonificacao();
		assertEquals(17000.00, valor, 0.0001);
	}
}
