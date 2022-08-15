package exercicio07testes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import exercicio07.entities.Vendedor;

public class VendedorTestes {
	
	private Vendedor vendedor;
	
	@Test
	public void deveCriarObjetoVendedor() throws Exception {
		vendedor = new Vendedor("Roberto", 32, 3000.00);
	}
	
	@Test
	public void deveHerdarMetodoBonificacaoERetornarValorAdicional() throws Exception {
		vendedor = new Vendedor("Roberto", 32, 3000.00);
		double valor = vendedor.bonificacao();
		assertEquals(6000.00, valor, 0.0001);
	}

}
