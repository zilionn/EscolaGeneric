package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import model.Prova;

public class ProvaController implements IAvaliacaoController<Prova>{
	
	private List<Prova> lista;

	public ProvaController() {
		lista = new ArrayList<>();
	}

	@Override
	public void criarLista(Prova t) {
		lista.add(t);
		
		Random r = new Random();
		double num = r.nextDouble() * 10.0;
		System.out.printf("Número gerado: %.1f%n", num);
	}

	@Override
	public Prova consultarAvaliacao(int posicao) {
		Prova prova = lista.get(posicao);
		return prova;
	}

	@Override
	public String limparLista() {
		lista.clear();
		return "Lista limpa com sucesso" + lista.toString();
	}

}
