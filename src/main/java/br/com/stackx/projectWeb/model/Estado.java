package br.com.stackx.projectWeb.model;

public class Estado {
	
	protected int idEstado;
	protected String nome;
	protected String sigla;
	protected int codIbge;
	
	public Estado() {
		this(0, null, null, 0);
	}
	
	
	public Estado(int idEstado, String nome, String sigla, int codIbge) {
		super();
		this.idEstado = idEstado;
		this.nome = nome;
		this.sigla = sigla;
		this.codIbge = codIbge;
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
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public int getCodIbge() {
		return codIbge;
	}
	public void setCodIbge(int codIbge) {
		this.codIbge = codIbge;
	}
	
	
}
