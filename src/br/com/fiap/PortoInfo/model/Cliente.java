package br.com.fiap.PortoInfo.model;

public class Cliente {
	int cpf;
	String nome;
	String endereco;
	String email;
	String telefone;
	
	
	public String showInfoClient(int cpf, String nome, String email, String telefone) {
		String result = "Segue as informações acerca do cliente " + nome + System.lineSeparator() + 
				"cpf: " + Integer.toString(cpf) + System.lineSeparator() +
				"email: " + email + System.lineSeparator() + 
				"telefone: " + telefone;
		return result;
	}
	
	
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
}
