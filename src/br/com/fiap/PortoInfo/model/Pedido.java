package br.com.fiap.PortoInfo.model;

public class Pedido {
	int id;
	int clienteId;
	String nomeCliente;
	String tipoTerreno;
	String enderecoLocal;
	String enderecoOrigem;
	String status;
	
	
	public int getId() {
		return id;
	}
	public int getClienteId() {
		return clienteId;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getTipoTerreno() {
		return tipoTerreno;
	}
	public void setTipoTerreno(String tipoTerreno) {
		this.tipoTerreno = tipoTerreno;
	}
	public String getEnderecoLocal() {
		return enderecoLocal;
	}
	public void setEnderecoLocal(String enderecoLocal) {
		this.enderecoLocal = enderecoLocal;
	}
	public String getEnderecoOrigem() {
		return enderecoOrigem;
	}
	public void setEnderecoOrigem(String enderecoOrigem) {
		this.enderecoOrigem = enderecoOrigem;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
