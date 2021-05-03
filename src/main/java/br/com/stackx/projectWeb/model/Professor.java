package br.com.stackx.projectWeb.model;

public class Professor {
	
	protected int IdProfessor;
	protected int idCidade;
	protected String nome;
	protected char sexo;
	protected int cpf;
	protected String email;
	protected int ddd;
	protected int telefone;
	protected int cep;
	protected String logradouro;
	protected int numero;
	protected int complemento;
	
	public Professor() {
		/* this(0, 0, null, null, 0, null, 0, 0, 0, null, 0, 0); */
	}
	
	
	
	public Professor(int idProfessor, int idCidade, String nome, char sexo, int cpf, String email, int ddd,
			int telefone, int cep, String logradouro, int numero, int complemento) {
		super();
		IdProfessor = idProfessor;
		this.idCidade = idCidade;
		this.nome = nome;
		this.sexo = sexo;
		this.cpf = cpf;
		this.email = email;
		this.ddd = ddd;
		this.telefone = telefone;
		this.cep = cep;
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
	}



	public int getIdProfessor() {
		return IdProfessor;
	}
	public void setIdProfessor(int idProfessor) {
		IdProfessor = idProfessor;
	}
	public int getIdCidade() {
		return idCidade;
	}
	public void setIdCidade(int idCidade) {
		this.idCidade = idCidade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getDdd() {
		return ddd;
	}
	public void setDdd(int ddd) {
		this.ddd = ddd;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public int getCep() {
		return cep;
	}
	public void setCep(int cep) {
		this.cep = cep;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getComplemento() {
		return complemento;
	}
	public void setComplemento(int complemento) {
		this.complemento = complemento;
	}
	
	
}
