package desafioDojoTestes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import desafioDojo.entities.AnoBissexto;

public class AnoBissextoTestes {
	
	@Test
	void deveVerificarSeOAnoEhDivisivelPor4EDivisivelPor100OuDivisivelPor400() throws Exception {
		AnoBissexto ano = new AnoBissexto();
		String esperado = ano.verificarAno(2016);
		assertEquals("2016 é um ano bissexto!", esperado);		
	}

}
