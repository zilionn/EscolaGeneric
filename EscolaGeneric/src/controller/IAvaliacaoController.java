package controller;

public interface IAvaliacaoController<T> {
	
	public void criarLista(T t);
	public T consultarAvaliacao(int posicao);
	public String limparLista();

}
