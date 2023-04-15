package br.com.fiap.PortoInfo.model;

public class Guincho {
	Veiculo veiculo = new Veiculo();
	Pedido pedido = new Pedido();
	int id;
	String tipo;
	float peso;
	String tipoCorda;
	boolean disponibilidade;
	
	float pesoVeiculo = veiculo.peso;
	float comprimentoVeiculo = veiculo.comprimento;
	float alturaVeiculo = veiculo.altura;
	int qtdEixosVeiculo = veiculo.qtdEixos;
	boolean chassiAlongado = veiculo.chassiAlongado;
	float capacidadeCarga = veiculo.capacidadeCarga;
	float pesoEixo = veiculo.getPesoEixo();
	
	String clima = pedido.clima.toLowerCase(); // em graus celsius
	String tipoTerreno = pedido.tipoTerreno.toLowerCase();
	
	
	public String pesoGuincho(float peso, int qtdEixos, boolean chassiAlongado, float capacidadeCarga) {
		// O peso ideal de um guincho é 1.5x a 2x o peso do veículo
		float result = peso * 2;
		// considerando que cada eixo 
		result += qtdEixos * pesoEixo;
		if (chassiAlongado) {
			// considerando que o peso médio entre os chassis é 1.5 tonelada;
			result += 1.5;
		}
		return "A tensão ideal do guincho deve ser é " + result;
	}
	
	public String tipoCorda(String clima, String tipoTerreno) {
		if (clima == "calor" || clima == "ensolarado" || clima == "quente") {
			System.out.println("Neste calor é necessário utilizar um cabo de Aço, é mais resistênte.");
		} else {
			System.out.println("De qualquer forma, o sintético é mais viável em outras situações do que o calor.");
		}
		if (tipoTerreno == "lama" || tipoTerreno == "detritos" || tipoTerreno == "pedras") {
			return "Já que o veículo do cliente está em um terreno de " + tipoTerreno + " é mais viável um guincho com um cabo SINTÉTICO. Mas caso o cabo esteja muito utilizado devido a grande exposição ao Sol, recomendamos que utilize um cabo de AÇO.";
		} else if (tipoTerreno == "areia" || tipoTerreno == "asfalto" || tipoTerreno == "terra") {
			return "Já que o veículo do cliente está em um terreno de " + tipoTerreno + " é mais viável um guincho com um cabo de AÇO.";
		}
		return "Valores inválidos no tipo de terreno";
	}
	

	public int getId() {
		return id;
	}


	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public String getTipoCorda() {
		return tipoCorda;
	}

	public void setTipoCorda(String tipoCorda) {
		this.tipoCorda = tipoCorda;
	}

	public boolean isDisponibilidade() {
		return disponibilidade;
	}

	public void setDisponibilidade(boolean disponibilidade) {
		this.disponibilidade = disponibilidade;
	}
}
