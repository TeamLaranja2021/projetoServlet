package model;

import java.text.DateFormat;

public class Tela {
	private String idTela;
	private String telaPai;
	private DateFormat dataCadastro;
	private String situacao;
	private String urlLog;
	private String versaoOriginal;
	private String imagemTela;
	public Tela() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Tela(String idTela, String telaPai, DateFormat dataCadastro, String situacao, String urlLog,
			String versaoOriginal, String imagemTela) {
		super();
		this.idTela = idTela;
		this.telaPai = telaPai;
		this.dataCadastro = dataCadastro;
		this.situacao = situacao;
		this.urlLog = urlLog;
		this.versaoOriginal = versaoOriginal;
		this.imagemTela = imagemTela;
	}
	public String getIdTela() {
		return idTela;
	}
	public void setIdTela(String idTela) {
		this.idTela = idTela;
	}
	public String getTelaPai() {
		return telaPai;
	}
	public void setTelaPai(String telaPai) {
		this.telaPai = telaPai;
	}
	public DateFormat getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(DateFormat dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	public String getSituacao() {
		return situacao;
	}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	public String getUrlLog() {
		return urlLog;
	}
	public void setUrlLog(String urlLog) {
		this.urlLog = urlLog;
	}
	public String getVersaoOriginal() {
		return versaoOriginal;
	}
	public void setVersaoOriginal(String versaoOriginal) {
		this.versaoOriginal = versaoOriginal;
	}
	public String getImagemTela() {
		return imagemTela;
	}
	public void setImagemTela(String imagemTela) {
		this.imagemTela = imagemTela;
	}
	
	
}
