package exercicio03.entities;

import java.util.ArrayList;
import java.util.List;

public class Guerreiro extends Personagem{
	
	List<String> habilidades = new ArrayList<>();

	public Guerreiro(String nome, Integer vida, Integer mana, Integer inteligencia, Integer forca,
			Integer level) {
		super(nome, vida, mana, inteligencia, forca, level);
	}

	public Guerreiro(String nome, Integer vida, Integer mana, Float xp, Integer inteligencia, Integer forca,
			Integer level, List<String> habilidades) {
		super(nome, vida, mana, xp, inteligencia, forca, level);
		this.habilidades = habilidades;
	}
	
	public List<String> getHabilidades() {
		if (habilidades.isEmpty()) {
			System.out.println("Você ainda não aprendeu nenhuma habilidade");
		} else {
			System.out.println("Habilidades:");
			for (String habilidade : habilidades) {
				System.out.println(habilidade);
			}
		}
		return habilidades;
	}

	public int lvlUp() {
		setForca(getForca() + 10); 
		setVida(getVida() + 10);
		return super.lvlUp();
	}
	
	public double attack() {
		System.out.print("Ataque realizado! Pontos: ");
		return getForca() * getLevel() + (Math.floor(Math.random() * 300));
	}
	
	public String aprenderHabilidade(String habilidade) {
		habilidades.add(habilidade);
		return "Você aprendeu a habilidade " + habilidade;		
	}

}
