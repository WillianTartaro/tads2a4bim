package br.unive.cadastro.model;

public enum Uf {

	PR("Paran�"),
	SP("S�o Paulo"),
	SC("Santa Catarina");
	
	
	private String nome;
	
	public String getNome(){
		return nome;
	}
	
	private Uf(String nome){
		this.nome = nome;
	}
}
