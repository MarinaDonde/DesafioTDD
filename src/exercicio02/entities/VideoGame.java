package exercicio02.entities;

import exercicio02.interfaces.Imposto;

public class VideoGame extends Produto implements Imposto{

	private String marca;
	private String modelo;
	private Boolean isUsado;
	
	public VideoGame() {
		
	}
	
	public VideoGame(String nome, Double preco, Integer qtd, String marca, String modelo, Boolean isUsado) {
		super(nome, preco, qtd);
		this.marca = marca;
		this.modelo = modelo;
		this.isUsado = isUsado;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Boolean getIsUsado() {
		return isUsado;
	}

	public void setIsUsado(Boolean isUsado) {
		this.isUsado = isUsado;
	}

	@Override
	public String calculaImposto() {
		if (isUsado) {
			return "Imposto " + getNome() + " " + getModelo() + " usado, R$ " + getPreco() * 0.25 + ".";
		} else {
			return "Imposto " + getNome() + " " + getModelo() + " R$ " + getPreco() * 0.45 + ".";
		}
	}

	@Override
	public String toString() {
		return "Video-Game: " + super.toString();
	}	
}
