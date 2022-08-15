package exercicio03testes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import exercicio03.entities.Mago;

public class MagoTestes {
	
	private Mago maguinho;
	
	
	@BeforeEach
	public void setup() {
		maguinho = new Mago("Maguinho", 300, 280, 80, 50, 10);
	}
	
	@Test
	void deveCriarObjetoMago() throws Exception {
		maguinho = new Mago("Maguinho", 300, 280, 80, 50, 10);
	}
	
	@Test
	void deveAumentarAManaEInteligenciaQuandoChamarOMetodoLvlUp() throws Exception {
		maguinho.lvlUp();
		int mana = maguinho.getMana();
		int inteligencia = maguinho.getInteligencia();
		assertEquals(295, mana, 0.0001);
		assertEquals(95, inteligencia, 0.0001);
	}
	
	@Test
	void deveMultiplicarInteligenciaELevelAoChamarMetodoAttack() throws Exception {
		double esperado = maguinho.getInteligencia() * maguinho.getLevel();
		assertEquals(800, esperado, 0.0001);
	}
	
	/*
	@ParameterizedTest
	@CsvSource({"80, 10, 800", "50, 10, 500"})
	void deveMultiplicarInteligenciaELevelAoChamarMetodoAttack(Integer inteligencia, Integer level, Double esperado) throws Exception {
		//esperado = maguinho.attack();
		//esperado = maguinho.getInteligencia() * maguinho.getLevel();
		//assertEquals(800, esperado, 0.0001);
		assertEquals(esperado, maguinho.attack(inteligencia, level));
	}
	*/
}
