package model;

import java.sql.Date;
import java.text.DateFormat;

public class Versao {
	private String idVersao;
	private Integer projeto;
	private String GMUD;
	private String descricao;
	private String situacao;
	private String dataLancamento;
	private String ordem;
	private String numeroVersao;
	
	public Versao(String idVersao, Integer projeto, String GMUD, String descricao, String situacao, String dataLancamento,
			String ordem, String numeroVersao) {
		super();
		this.idVersao = idVersao;
		this.projeto = projeto;
		this.GMUD = GMUD;
		this.descricao = descricao;
		this.situacao = situacao;
		this.dataLancamento = dataLancamento;
		this.ordem = ordem;
		this.numeroVersao = numeroVersao;
	}
	public Versao() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getIdVersao() {
		return idVersao;
	}
	public void setIdVersao(String idVersao) {
		this.idVersao = idVersao;
	}
	public Integer getProjeto() {
		return projeto;
	}
	public void setProjeto(Integer projeto) {
		this.projeto = projeto;
	}
	public String getGMUD() {
		return GMUD;
	}
	public void setGMUD(String gMUD) {
		GMUD = gMUD;
	}
	public String getSituacao() {
		return situacao;
	}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	public String getOrdem() {
		return ordem;
	}
	public void setOrdem(String ordem) {
		this.ordem = ordem;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getDataLancamento() {
		return dataLancamento;
	}
	public void setDataLancamento(String dataLancamento) {
		this.dataLancamento = dataLancamento;
	}
	public String getNumeroVersao() {
		return numeroVersao;
	}
	public void setNumeroVersao(String numeroVersao) {
		this.numeroVersao = numeroVersao;
	}
	

	
	
}
