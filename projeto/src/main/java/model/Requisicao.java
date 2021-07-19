package model;

public class Requisicao {
	private int idRequisicao;
	private int idEvento;
	private String urlHomolog;
	private String uriProd;
	private String descricao;
	private int requisicaoPai;
	private String camada;
	private boolean situacao;
	private int ordem;
	public Requisicao(int idRequisicao, int idEvento, String urlHomolog, String uriProd, String descricao,
			int requisicaoPai, String camada, boolean situacao, int ordem) {
		super();
		this.idRequisicao = idRequisicao;
		this.idEvento = idEvento;
		this.urlHomolog = urlHomolog;
		this.uriProd = uriProd;
		this.descricao = descricao;
		this.requisicaoPai = requisicaoPai;
		this.camada = camada;
		this.situacao = situacao;
		this.ordem = ordem;
	}
	public Requisicao() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getIdRequisicao() {
		return idRequisicao;
	}
	public void setIdRequisicao(int idRequisicao) {
		this.idRequisicao = idRequisicao;
	}
	public int getIdEvento() {
		return idEvento;
	}
	public void setIdEvento(int idEvento) {
		this.idEvento = idEvento;
	}
	public String getUrlHomolog() {
		return urlHomolog;
	}
	public void setUrlHomolog(String urlHomolog) {
		this.urlHomolog = urlHomolog;
	}
	public String getUriProd() {
		return uriProd;
	}
	public void setUriProd(String uriProd) {
		this.uriProd = uriProd;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getRequisicaoPai() {
		return requisicaoPai;
	}
	public void setRequisicaoPai(int requisicaoPai) {
		this.requisicaoPai = requisicaoPai;
	}
	public String getCamada() {
		return camada;
	}
	public void setCamada(String camada) {
		this.camada = camada;
	}
	public boolean isSituacao() {
		return situacao;
	}
	public void setSituacao(boolean situacao) {
		this.situacao = situacao;
	}
	public int getOrdem() {
		return ordem;
	}
	public void setOrdem(int ordem) {
		this.ordem = ordem;
	}
	
	
	
	
	
}
