package br.unive.cadastro.model;

public class Cliente {
	
	private int id;
	private String nome;
	private String edereco;
	private String telefone;
	private String cidade;
	private Uf uf;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEdereco() {
		return edereco;
	}
	public void setEdereco(String edereco) {
		this.edereco = edereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public Uf getUf() {
		return uf;
	}
	public void setUf(Uf uf) {
		this.uf = uf;
	}
	
	

}
