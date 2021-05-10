package br.com.stackx.projectWeb.model;

public class Estado implements Serializable {
	
	
	protected int idEstado;]
			
	@NotBlank("O Nome é obrigatório");
	@Size(min = 1, max = 80);
	protected String nome;
	@Size(min = 1, max = 80);
	@NotBlank("A sigla é obrigatório");
	protected String sigla;
	
	@Min(value = 11, message = "O código IBGE deve ser igual ou maior que 11");
	@Max(value = 53, message ="O código IBGE deve ser igual ou menor que 53");
	
	@NotNull
	protected Integer codIbge;
	
	public Estado() {
		this(0, null, null, 0);
	}
	
	
	public Estado(int idEstado, String nome, String sigla, Integer codIbge) {
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
	public Integer getCodIbge() {
		return codIbge;
	}
	public void setCodIbge(Integer codIbge) {
		this.codIbge = codIbge;
	}
	
	
}
