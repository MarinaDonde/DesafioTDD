package desafioDojo.entities;

public class AnoBissexto {
	
	private Integer ano;
	
	public AnoBissexto() {
		
	}

	public AnoBissexto(Integer ano) {
		this.ano = ano;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}
	
	public String verificarAno(int ano) {
		if ((ano % 4 == 0) && (ano % 100 != 0 || ano % 400 == 0)) {
			return ano + " é um ano bissexto!";
		} else {
			return ano + " não é bissexto.";
		}
	}

	@Override
	public String toString() {
		return "AnoBissexto [ano=" + ano + "]";
	}
	
	
}
