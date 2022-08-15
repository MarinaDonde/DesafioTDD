package exercicio02.entities;

import exercicio02.interfaces.Imposto;

public class Livro extends Produto implements Imposto {
	
	private String autor;
	private String tema;
	private Integer qtdPag;

	
	public Livro(String nome, Double preco, Integer qtd, String autor, String tema, Integer qtdPag) {
		super(nome, preco, qtd);
		this.autor = autor;
		this.tema = tema;
		this.qtdPag = qtdPag;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public Integer getQtdPag() {
		return qtdPag;
	}

	public void setQtdPag(Integer qtdPag) {
		this.qtdPag = qtdPag;
	}
	
	@Override
	public String calculaImposto() {
		if (this.tema == "educativo") {
			return "Livro educativo não tem imposto: " + getNome() + ".";
		} else {
			return "R$ " + getPreco() * 0.10 + " de impostos sobre o livro " + getNome() + ".";
		}
	}

	@Override
	public String toString() {
		return "Título: " + super.toString();
	}

}
