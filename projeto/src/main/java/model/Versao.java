package model;

import java.sql.Date;
import java.text.DateFormat;

public class Versao {
	private int idVersao;
	private int projeto;
	private String GMUD;
	private String descricao;
	private String situacao;
	private Date DataLancamento;
	private String ordem;
	private String numeroVersao;
	public Versao(int idVersao, int projeto, String gMUD, String descricao, String situacao, Date dataLancamento,
			String ordem, String numeroVersao) {
		super();
		this.idVersao = idVersao;
		this.projeto = projeto;
		GMUD = gMUD;
		this.descricao = descricao;
		this.situacao = situacao;
		DataLancamento = dataLancamento;
		this.ordem = ordem;
		this.numeroVersao = numeroVersao;
	}
	public int getIdVersao() {
		return idVersao;
	}
	public void setIdVersao(int idVersao) {
		this.idVersao = idVersao;
	}
	public int getProjeto() {
		return projeto;
	}
	public void setProjeto(int projeto) {
		this.projeto = projeto;
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
	public String getSituacao() {
		return situacao;
	}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	public Date getDataLancamento() {
		return DataLancamento;
	}
	public void setDataLancamento(Date dataLancamento) {
		DataLancamento = dataLancamento;
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
	public Versao() {
		super();
		// TODO Auto-generated constructor stub
	}

	

}
