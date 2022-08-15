package exercicio03testes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import exercicio03.entities.Personagem;

public class PersonagemTestes {
	
	private Personagem player;
	
	@BeforeEach
	public void setup() {
		player = new Personagem("Maguinho", 300, 280, 80, 50, 10);
	}
	
	@Test
	void deveCriarObjetoPersonagem() throws Exception {
		player = new Personagem("Maguinho", 300, 280, 80, 50, 10);
	}
	
	@Test
	void deveCriarMetodoLvlUp() throws Exception {
		player.lvlUp();
	}
	
	@Test 
	void deveAumentarUmLevelQuandoChamarOMetodoLvlUp() throws Exception {
		int esperado = player.lvlUp();
		assertEquals(11, esperado, 0.0001);
	}
	
	@Test
	void deveAumentarVariosAtributosQuandoChamarOMetodoLvlUp() throws Exception {
		player.lvlUp();
		int vida = player.getVida();
		int mana = player.getMana();
		int inteligencia = player.getInteligencia();
		int forca = player.getForca();
		assertEquals(305, vida, 0.0001);
		assertEquals(285, mana, 0.0001);
		assertEquals(85, inteligencia, 0.0001);
		assertEquals(55, forca, 0.0001);
	}
}
