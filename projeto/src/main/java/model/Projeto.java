package model;

public class Projeto {
	private int idProjeto;
	private String nomeProjeto;
	private boolean situacao;
	public int getIdProjeto() {
		return idProjeto;
	}
	public void setIdProjeto(int idProjeto) {
		this.idProjeto = idProjeto;
	}
	public String getNomeProjeto() {
		return nomeProjeto;
	}
	public void setNomeProjeto(String nomeProjeto) {
		this.nomeProjeto = nomeProjeto;
	}

	public boolean isSituacao() {
		return situacao;
	}
	
	public void setSituacao(boolean situacao) {
		this.situacao = situacao;
	}
	public Projeto(int idProjeto, String nomeProjeto, boolean situacao) {
		super();
		this.idProjeto = idProjeto;
		this.nomeProjeto = nomeProjeto;
		this.situacao = situacao;
	}
	public Projeto() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}
