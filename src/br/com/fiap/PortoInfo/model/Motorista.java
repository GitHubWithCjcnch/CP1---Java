package br.com.fiap.PortoInfo.model;

public class Motorista {
	int id;
	String nome;
	String telefone;
	boolean disponibilidade;
	
	public String dadosDisponibilidade(String nome, boolean disponibilidade) {
		return nome+ "<- Nome Motorista / Disponivel? -> "+ Boolean.toString(disponibilidade);
	}
	
	public String identificarMotorista(int id, String nome, String telefone) {
		return Integer.toString(id) + " <- Identificador geral / Nome e telefone -> "+ nome + " - " + telefone;
		
	}
	public int getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public boolean isDisponibilidade() {
		return disponibilidade;
	}
	public void setDisponibilidade(boolean disponibilidade) {
		this.disponibilidade = disponibilidade;
	}
}
