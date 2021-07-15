package model;

public class Projeto {
	private String idProjeto;
	private String nomeProjeto;
	private String situacao;
	public Projeto(String idProjeto, String nomeProjeto, String situacao) {
		super();
		this.idProjeto = idProjeto;
		this.nomeProjeto = nomeProjeto;
		this.situacao = situacao;
	}
	public Projeto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getIdProjeto() {
		return idProjeto;
	}
	public void setIdProjeto(String idProjeto) {
		this.idProjeto = idProjeto;
	}
	public String getNomeProjeto() {
		return nomeProjeto;
	}
	public void setNomeProjeto(String nomeProjeto) {
		this.nomeProjeto = nomeProjeto;
	}
	public String getSituacao() {
		return situacao;
	}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	
	
}
