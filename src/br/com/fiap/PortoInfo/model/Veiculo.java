package br.com.fiap.PortoInfo.model;

public class Veiculo {
	int id;
	float peso;
	float comprimento;
	float altura;
	String placa;
	String modelo;
	boolean chassiAlongado;
	int qtdEixos;
	String tipoCarroceria;
	float capacidadeCarga;
	float pesoEixo;
	
	
	public float getPesoEixo() {
		return pesoEixo;
	}
	public 
	float setPesoEixo(float pesoEixo) {
		if (qtdEixos > 0) {
			this.pesoEixo = pesoEixo;
			return pesoEixo;
		}
		return 0;
	}
		
	// Não é necessário setId na classe veículo uma vez que no banco de dados
	// o Id será autoincrementado;
	public int getId() {
		return id;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public float getComprimento() {
		return comprimento;
	}
	public void setComprimento(float comprimento) {
		this.comprimento = comprimento;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public boolean isChassiAlongado() {
		return chassiAlongado;
	}
	public void setChassiAlongado(boolean chassiAlongado) {
		this.chassiAlongado = chassiAlongado;
	}
	public int getQtdEixos() {
		return qtdEixos;
	}
	public void setQtdEixos(int qtdEixos) {
		this.qtdEixos = qtdEixos;
	}
	public String getTipoCarroceria() {
		return tipoCarroceria;
	}
	public void setTipoCarroceria(String tipoCarroceria) {
		this.tipoCarroceria = tipoCarroceria;
	}
	public float getCapacidadeCarga() {
		return capacidadeCarga;
	}
	public void setCapacidadeCarga(float capacidadeCarga) {
		this.capacidadeCarga = capacidadeCarga;
	}
	
	
}
