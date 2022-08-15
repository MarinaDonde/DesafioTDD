package exercicio03.entities;

import java.util.ArrayList;
import java.util.List;

public class Mago extends Personagem{
	
	List<String> magias = new ArrayList<>();
	
	public Mago(String nome, Integer vida, Integer mana, Integer inteligencia, Integer forca, Integer level) {
		super(nome, vida, mana, inteligencia, forca, level);

	}

	public Mago(String nome, Integer vida, Integer mana, Float xp, Integer inteligencia, Integer forca, Integer level,
			List<String> magias) {
		super(nome, vida, mana, xp, inteligencia, forca, level);
		this.magias = magias;
	}

	public List<String> getMagias() {
		if (magias.isEmpty()) {
			System.out.println("Você ainda não aprendeu nenhuma magia");
		} else {
			System.out.println("Magias:");
			for (String magia : magias) {
				System.out.println(magia);
			}
		}
		return magias;
	}

	public int lvlUp() {	
		setMana(getMana() + 10);
		setInteligencia(getInteligencia() + 10);
		return super.lvlUp();
	}
	
	public double attack() {
		System.out.print("Ataque realizado! Pontos: ");
		return getInteligencia() * getLevel() + (Math.floor(Math.random() * 300));
	}
	
	public String aprenderMagia(String magia) {
		magias.add(magia);
		return "Você aprendeu a magia " + magia;
	}

}
