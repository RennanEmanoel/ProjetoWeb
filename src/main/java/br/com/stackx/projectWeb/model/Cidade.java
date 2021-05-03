package br.com.stackx.projectWeb.model;

public class Cidade {
	protected int idCidade;
	protected int idEstado;
	protected String nome;
	protected int codIBGE;
	
	public Cidade() {
		
	}
	
	
	public Cidade(int idCidade, int idEstado, String nome, int codIBGE) {
		super();
		this.idCidade = idCidade;
		this.idEstado = idEstado;
		this.nome = nome;
		this.codIBGE = codIBGE;
	}


	public int getIdCidade() {
		return idCidade;
	}
	public void setIdCidade(int idCidade) {
		this.idCidade = idCidade;
	}
	public int getIdEstado() {
		return idEstado;
	}
	public void setIdEstado(int idEstado) {
		this.idEstado = idEstado;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCodIBGE() {
		return codIBGE;
	}
	public void setCodIBGE(int codIBGE) {
		this.codIBGE = codIBGE;
	}
	
	
}
