package br.com.fiap.PortoInfo.model;

public class Pagamento {
	int id;
	float valor;
	String metodoPagamento;
	String status;
	
	public String identificarPagamento(int id, String status) {
		return Integer.toString(id) + " <- Identificador geral / Status -> "+ status;
		
	}
	public String dadosPagamento(String metodoPagemento, float valor) {
		return metodoPagamento + " <- Metodo de pagamento/ valor -> "+ Float.toString(valor);
		
	}
	public int getId() {
		return id;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public String getMetodoPagamento() {
		return metodoPagamento;
	}
	public void setMetodoPagamento(String metodoPagamento) {
		this.metodoPagamento = metodoPagamento;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
