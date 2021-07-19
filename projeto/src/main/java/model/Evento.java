package model;

public class Evento {
	private int idEvento;
	private int idTela;
	private boolean situacao;
	private int ordem;
	private String parametros;
	
	public Evento(int idEvento, int idTela, boolean situacao, int ordem, String parametros) {
		super();
		this.idEvento = idEvento;
		this.idTela = idTela;
		this.situacao = situacao;
		this.ordem = ordem;
		this.parametros = parametros;
	}
	public Evento() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getIdEvento() {
		return idEvento;
	}
	public void setIdEvento(int idEvento) {
		this.idEvento = idEvento;
	}
	public int getIdTela() {
		return idTela;
	}
	public void setIdTela(int idTela) {
		this.idTela = idTela;
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
	public String getParametros() {
		return parametros;
	}
	public void setParametros(String parametros) {
		this.parametros = parametros;
	}
	
	
}
