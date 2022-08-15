package exercicio01.entities;

public class Veiculo {
	
	private String marca;
	private String modelo;
	private String placa;
	private String cor;
	private Float km;
	private Boolean isLigado;
	private Integer litrosCombustivel;
	private Integer velocidade = 0;
	private Double preco;
	
	public Veiculo(Boolean isLigado, Integer litrosCombustivel, Integer velocidade) {
		this.isLigado = isLigado;
		this.litrosCombustivel = litrosCombustivel;
		this.velocidade = velocidade;
	}
	
	public Veiculo(String marca, String modelo, String placa, String cor, Boolean isLigado, Integer litrosCombustivel,
			Integer velocidade) {
		this.marca = marca;
		this.modelo = modelo;
		this.placa = placa;
		this.cor = cor;
		this.isLigado = isLigado;
		this.litrosCombustivel = litrosCombustivel;
		this.velocidade = velocidade;
	}

	public Veiculo(String marca, String modelo, String placa, String cor, Float km, Boolean isLigado,
			Integer litrosCombustivel, Integer velocidade, Double preco) {
		this.marca = marca;
		this.modelo = modelo;
		this.placa = placa;
		this.cor = cor;
		this.km = km;
		this.isLigado = isLigado;
		this.litrosCombustivel = litrosCombustivel;
		this.velocidade = velocidade;
		this.preco = preco;
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

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Float getKm() {
		return km;
	}

	public void setKm(Float km) {
		this.km = km;
	}

	public Boolean getIsLigado() {
		return isLigado;
	}

	public void setIsLigado(Boolean isLigado) {
		this.isLigado = isLigado;
	}

	public Integer getLitrosCombustivel() {
		return litrosCombustivel;
	}

	public void setLitrosCombustivel(Integer litrosCombustivel) {
		this.litrosCombustivel = litrosCombustivel;
	}

	public Integer getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(Integer velocidade) {
		this.velocidade = velocidade;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public int acelerar() {
		if (this.isLigado == false) {
			System.out.print("Por favor, ligue o Veículo. Velocidade: ");
			return 0;
		} else if (this.litrosCombustivel == 0) {
			System.out.println("É necessário abastecer o Veículo!");
			return 0;
		} else {
			System.out.print("Velocidade atual: ");
			return this.velocidade += 20;
		}
	}
	
	public int abastecer(int combustivel) {
		if (this.isLigado == true) {
			System.out.print("É preciso desligar o Veículo para abastecer. Combustível: ");
			return this.litrosCombustivel;
		} else if (this.litrosCombustivel > 60 || this.litrosCombustivel == 60) {
			System.out.print("Seu tanque está completo! Combustivel: ");
			return this.litrosCombustivel;
		} else {
			this.litrosCombustivel += combustivel;
			if (this.litrosCombustivel > 60) {
				int excesso = this.litrosCombustivel - 60;
				System.out.print("Não é possível abastecer. Litros além da capacidade: ");
				return excesso;
			} else {
				System.out.print("Carro abastecido! Total L ");
				return this.litrosCombustivel;
			}
		}
	}
	
	public int frear() {
		this.velocidade -= 20;
		if (this.velocidade < 0) {
			this.velocidade = 0;
			System.out.print("O Veículo está parado! Velocidade: ");
			return 0;
		}
		System.out.print("Velocidade atual: ");
		return this.velocidade;		
	}
	
	public String pintar(String cor) {
		this.cor = cor;
		return "O Veículo foi pintado na cor " + cor;
	}
	
	public String ligar() {
		if (this.isLigado == false) {
			this.velocidade = 0;
			this.isLigado = true;
		}
		return "O Veículo está ligado";
	}
	
	public String desligar() {
		if (this.isLigado && this.velocidade > 0) {
			return "É preciso parar o Veículo!";
		} else {
			this.isLigado = false;
			return "Desligando o Veículo";
		}
	}
	
	public void menuJogoVeiculo() {
		System.out.println();
		System.out.println("Opções:");
		System.out.println("1 - Ligar o veículo");
		System.out.println("2 - Desligar o veículo");
		System.out.println("3 - Abastecer o veículo");
		System.out.println("4 - Acelerar o veículo");
		System.out.println("5 - Frear o veículo");
		System.out.println("6 - Pintar o veículo");
		System.out.println("7 - Voltar ao menu inicial");
		System.out.println("8 - Informações do veículo");
		System.out.println("0 - Sair da aplicação");
		System.out.println();
		System.out.print("O que você deseja fazer? Escolha uma opção acima: ");
	}

	@Override
	public String toString() {
		return "Veiculo [marca = " + marca + ", modelo = " + modelo + ", placa = " + placa + ", cor = " + cor 
				+ ", está ligado? " + isLigado + ", litrosCombustivel = " + litrosCombustivel + ", velocidade = " + velocidade
				+ "]";
	}
	
	

}
