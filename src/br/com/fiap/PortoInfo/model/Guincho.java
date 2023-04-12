package br.com.fiap.PortoInfo.model;

public class Guincho {
	int id;
	String tipo;
	float peso;
	String tipoCorda;
	boolean disponibilidade;
	
	public float pesoGuincho(float pesoGuincho) {
		return 1;
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
