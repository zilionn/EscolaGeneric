package controller;

import java.util.ArrayList;
import java.util.List;

import model.Atividade;

public class AtividadeController implements IAvaliacaoController<Atividade> {
	
	private List<Atividade> lista;

	public AtividadeController() {
		lista = new ArrayList<>();
	}

	@Override
	public void criarLista(Atividade t) {
		lista.add(t);
	}
	
	@Override
	public Atividade consultarAvaliacao(int posicao) {
		Atividade atividade = lista.get(posicao);
		return atividade;
	}

	@Override
	public String limparLista() {
		lista.clear();
		return "Lista limpa com sucesso" + lista.toString();
		
	}

	
}
