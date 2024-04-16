package model;

public class Atividade {
	
	private String assunto;
	private int qntdPag;
	
	public Atividade() {
		super();
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	public int getQtndPag() {
		return qntdPag;
	}

	public void setQtndPag(int qtndPag) {
		this.qntdPag = qtndPag;
	}
	
	@Override
	public String toString() {
		return "O assunto da atividade é " + assunto + " com " + qntdPag + " páginas exigidas";
	}

	
}
