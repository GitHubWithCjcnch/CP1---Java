package br.com.fiap.PortoInfo.model;

public class Caminhao {
	int id;
	float peso;
	boolean disponibilidade;
	String modelo;
	
	public String dadosDisponibilidade(String modelo, boolean disponibilidade) {
		return modelo + "<- Modelo/ Disponivel? -> "+ Boolean.toString(disponibilidade);
	}
	
	public String dadosBasicosCaminhao(float peso, String modelo) {
		return  modelo + " <- Modelo do veiculo / Peso do veiculo -> "+ Float.toString(peso);
	}
	
	public int getId() {
		return id;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public boolean isDisponibilidade() {
		return disponibilidade;
	}
	public void setDisponibilidade(boolean disponibilidade) {
		this.disponibilidade = disponibilidade;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
}
