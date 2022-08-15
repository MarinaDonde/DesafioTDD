package exercicio01testes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import exercicio01.entities.Veiculo;

public class VeiculoTeste {
	
	private Veiculo carro;
	
	/*
	@BeforeEach
	public void setup() {
		carro = new Veiculo(false, 10, 0);
	}
	*/
	@Test
	void deveCriarObjetoVeiculo() throws Exception {
		carro = new Veiculo(false, 10, 0);
	}
	
	@Test
	@Disabled
	void deveAumentarAVelocidadeQuandoAcelera() throws Exception {
		carro = new Veiculo(true, 10, 0);
		int esperado = carro.acelerar();
		assertEquals(20, esperado, 0.0001);
	}
	
	@Test
	void deveRetornarZeroQuandoOCarroEstiverDesligado() throws Exception {
		carro = new Veiculo(false, 10, 0);
		int esperado = carro.acelerar();
		assertEquals(0, esperado, 0.0001);
	}
	
	@Test
	void deveRetornarZeroSeOCarroEstiverSemCombustivel() throws Exception {
		carro = new Veiculo(true, 0, 0);
		int esperado = carro.acelerar();
		assertEquals(0, esperado, 0.0001);
	}
	
	@Test
	void deveAumentarOCombustivelQuandoAbastece() throws Exception {
		carro = new Veiculo(false, 10, 0);
		int esperado = carro.abastecer(40);
		assertEquals(50, esperado, 0.0001);
	}
	
	@Test
	void deveImpedirOAbastecimentoCasoOVeiculoEstejaLigado() throws Exception {
		carro = new Veiculo(true, 10, 0);
		int esperado = carro.abastecer(40);
		assertEquals(10, esperado, 0.0001);
	}
	
	@Test
	void deveValidarAQuantidadeDeCombustivelENaoUltrapassar60L() throws Exception {
		carro = new Veiculo(false, 55, 0);
		int esperado = carro.abastecer(10);
		assertEquals(5, esperado, 0.0001);
	}
	
	@Test
	void deveImpedirOAbastecimentoCasoOVeiculoEstejaCom60LOuMais() throws Exception {
		carro = new Veiculo(false, 65, 0);
		int esperado = carro.getLitrosCombustivel();
		assertEquals(65, esperado, 0.0001);
	}
	
	@Test
	void deveDiminuirAVelocidadeQuandoFrea() throws Exception {
		carro = new Veiculo(true, 10, 40);
		int esperado = carro.frear();
		assertEquals(20, esperado, 0.0001);
	}
	
	@Test
	void deveReceberUmaCorComoParametroEAlterarOAtributo() throws Exception{
		carro = new Veiculo(true, 10, 0);
		String esperado = carro.pintar("Prata");
		assertEquals("O Veículo foi pintado na cor Prata", esperado);
	}
	
	@Test
	void deveVerificarSeOVeiculoEstaLigadoELigarCasoEstejaDesligado() throws Exception{
		carro = new Veiculo(false, 10, 0);
		carro.ligar();
		boolean esperado = carro.getIsLigado();
		assertEquals(true, esperado);
	}
	
	@Test
	void deveVerificarSeOVeiculoEstaDesligadoEDesligarCasoEstejaLigado() throws Exception{
		carro = new Veiculo(true, 10, 0);
		carro.desligar();
		boolean esperado = carro.getIsLigado();
		assertEquals(false, esperado);
	}
	
	@Test
	void deveVerificarAVelocidadeDoVeiculoENaoDesligarCasoAVelocidadeSejaMaiorQueZero() throws Exception{
		carro = new Veiculo(true, 10, 40);
		carro.desligar();
		boolean esperado = carro.getIsLigado();
		assertEquals(true, esperado);	
	}
	
}
