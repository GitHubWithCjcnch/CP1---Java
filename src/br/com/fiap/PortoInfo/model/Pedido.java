package br.com.fiap.PortoInfo.model;

public class Pedido {
	int id;
	int clienteId;
	String nomeCliente;
	String tipoTerreno;
	String clima;
	String enderecoLocal;
	String enderecoOrigem;
	String status;
	
	
	public String rota(String enderecoOrigem, String enderecoLocal) {
		return enderecoOrigem + " <- de / para -> "+ enderecoLocal;
	}
	
	public String tipoLocal(String tipoTerreno, String clima) {
		return tipoTerreno + " <- Tipo de terreno do local / Clima do local -> "+ clima;
		
	}
	
	public String identificarCliente(int id, int clienteId) {
		return Integer.toString(id) + " <- Identificador geral / Identificador cliente -> " + Integer.toString(clienteId);
	}
	
	
	public String atualizacaoPedido(String nomeCliente, String status) {
		return nomeCliente + " <- Nome do cliente / Status do pedido -> "+ status;
		
	}
	
	public int getId() {
		return id;
	}
	public int getClienteId() {
		return clienteId;
	}
	public String getClima() {
		return clima;
	}
	public void setClima(String clima) {
		this.clima = clima;
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
