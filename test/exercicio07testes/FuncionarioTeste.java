package exercicio07testes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import exercicio07.entities.Funcionario;

public class FuncionarioTeste {
	
	private Funcionario funcionario;
	
	@BeforeEach
	public void setup() {
		funcionario = new Funcionario("João", 30, 4000.00);
	}
	
	@Test
	public void deveCriarObjetoFuncionario() throws Exception {
		funcionario = new Funcionario("João", 30, 4000.00);
	}
	
	@Test
	public void deveCriarMetodoBonificacao() throws Exception {
		funcionario.bonificacao();
	}
	
	@Test
	public void deveRetornarOSalarioNoMetodoBonificacao() throws Exception {
		double valor = funcionario.bonificacao();
		assertEquals(4000.00, valor, 0.0001);
	}	
}
