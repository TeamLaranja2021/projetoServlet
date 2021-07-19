package model;


import java.util.Date;

public class Tela {
	private int idTela;
	private int idVersao;
	private Date dataCadastro;
	private String nomeTela;
	private String imagem;
	private boolean situacao;
	private int telaPai;
	private int ordem;
	private String urlog;
	private int versaoOrigem;
	public Tela() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getIdTela() {
		return idTela;
	}
	public void setIdTela(int idTela) {
		this.idTela = idTela;
	}
	public int getIdVersao() {
		return idVersao;
	}
	public void setIdVersao(int idVersao) {
		this.idVersao = idVersao;
	}
	public Date getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	public String getNomeTela() {
		return nomeTela;
	}
	public void setNomeTela(String nomeTela) {
		this.nomeTela = nomeTela;
	}
	public String getImagem() {
		return imagem;
	}
	public void setImagem(String imagem) {
		this.imagem = imagem;
	}
	public boolean isSituacao() {
		return situacao;
	}
	public void setSituacao(boolean situacao) {
		this.situacao = situacao;
	}
	public int getTelaPai() {
		return telaPai;
	}
	public void setTelaPai(int telaPai) {
		this.telaPai = telaPai;
	}
	public int getOrdem() {
		return ordem;
	}
	public void setOrdem(int ordem) {
		this.ordem = ordem;
	}
	public String getUrlog() {
		return urlog;
	}
	public void setUrlog(String urlog) {
		this.urlog = urlog;
	}
	public int getVersaoOrigem() {
		return versaoOrigem;
	}
	public void setVersaoOrigem(int versaoOrigem) {
		this.versaoOrigem = versaoOrigem;
	}
	public Tela(int idTela, int idVersao, Date dataCadastro, String nomeTela, String imagem, boolean situacao,
			int telaPai, int ordem, String urlog, int versaoOrigem) {
		super();
		this.idTela = idTela;
		this.idVersao = idVersao;
		this.dataCadastro = dataCadastro;
		this.nomeTela = nomeTela;
		this.imagem = imagem;
		this.situacao = situacao;
		this.telaPai = telaPai;
		this.ordem = ordem;
		this.urlog = urlog;
		this.versaoOrigem = versaoOrigem;
	}
	
	
	
	
}
