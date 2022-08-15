package exercicio07testes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import exercicio07.entities.Supervisor;

public class SupervisorTeste {
	
	private Supervisor supervisor;
	
	@Test
	public void deveCriarObjetoSupervisor() throws Exception {
		supervisor = new Supervisor("Felipe", 45, 4500.00);
	}
	
	@Test
	public void deveHerdarMetodoBonificacaoERetornarValorAdicional() throws Exception {
		supervisor = new Supervisor("Felipe", 45, 4500.00);
		double valor = supervisor.bonificacao();
		assertEquals(9500.00, valor, 0.0001);
	}
}
