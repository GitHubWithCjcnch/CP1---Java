package br.com.fiap.PortoInfo.model;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;


public class Usuario {
	int id;
	int clienteId;
	String login;
	String senha;
	String loginStatus;
	Date registerDate = new Date();
	
	DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); 
    String dataFormatada = dateFormat.format(registerDate);
	
	public String dadosConta(String login, String senha) {
		return login + " <- Login / Senha -> "+ senha;
	}
	
	public String dadosAcesso(String loginStatus, String dataFormatada) {
		return loginStatus + " <- Status de login/ Registro de acesso -> "+ dataFormatada;
		
	}
	
	public String identificarUsuario(int id, int clienteId) {
		return login + "<- Login/  Identificador geral e Identificar Cliente-> "+ Integer.toString(id) + " - " + Integer.toString(clienteId);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getClienteId() {
		return clienteId;
	}
	public void setClienteId(int clienteId) {
		this.clienteId = clienteId;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getLoginStatus() {
		return loginStatus;
	}
	public void setLoginStatus(String loginStatus) {
		this.loginStatus = loginStatus;
	}
	public Date getRegisterDate() {
		return registerDate;
	}
	
	
}
