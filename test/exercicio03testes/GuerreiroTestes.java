package exercicio03testes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import exercicio03.entities.Guerreiro;

public class GuerreiroTestes {
	
	private Guerreiro knight;
	
	@BeforeEach
	public void setup() {
		knight = new Guerreiro("Kina", 500, 80, 40, 120, 10);
	}
	
	@Test
	void deveCriarObjetoGuerreiro() throws Exception {
		knight = new Guerreiro("Kina", 500, 80, 40, 120, 10);
	}
	
	@Test
	void deveAumentarAVidaEForcaQuandoChamarOMetodoLvlUp() throws Exception {
		knight.lvlUp();
		int vida = knight.getVida();
		int forca = knight.getForca();
		assertEquals(515, vida, 0.0001);
		assertEquals(135, forca, 0.0001);
	}
	
	@Test
	void deveMultiplicarInteligenciaELevelAoChamarMetodoAttack() throws Exception {
		double esperado = knight.getForca() * knight.getLevel();
		assertEquals(1200, esperado, 0.0001);
	}

}
