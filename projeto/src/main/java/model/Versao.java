package model;



import java.util.Date;

public class Versao {
	private int idVersao;
	private int idProjeto;
	private String GMUD;
	private String descricao;
	private boolean situacao;
	private Date dataLancamento;
	private String ordem;
	private String numeroVersao;
	public Versao() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getIdVersao() {
		return idVersao;
	}
	public void setIdVersao(int idVersao) {
		this.idVersao = idVersao;
	}
	public int getIdProjeto() {
		return idProjeto;
	}
	public void setIdProjeto(int idProjeto) {
		this.idProjeto = idProjeto;
	}
	public String getGMUD() {
		return GMUD;
	}
	public void setGMUD(String gMUD) {
		GMUD = gMUD;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public boolean isSituacao() {
		return situacao;
	}
	public void setSituacao(boolean situacao) {
		this.situacao = situacao;
	}
	public Date getDataLancamento() {
		return dataLancamento;
	}
	public void setDataLancamento(Date dataLancamento) {
		this.dataLancamento = dataLancamento;
	}
	public String getOrdem() {
		return ordem;
	}
	public void setOrdem(String ordem) {
		this.ordem = ordem;
	}
	public String getNumeroVersao() {
		return numeroVersao;
	}
	public void setNumeroVersao(String numeroVersao) {
		this.numeroVersao = numeroVersao;
	}
	public Versao(int idVersao, int idProjeto, String gMUD, String descricao, boolean situacao, Date dataLancamento,
			String ordem, String numeroVersao) {
		super();
		this.idVersao = idVersao;
		this.idProjeto = idProjeto;
		GMUD = gMUD;
		this.descricao = descricao;
		this.situacao = situacao;
		this.dataLancamento = dataLancamento;
		this.ordem = ordem;
		this.numeroVersao = numeroVersao;
	}
	

}
