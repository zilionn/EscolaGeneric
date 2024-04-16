package view;

import controller.AtividadeController;
import controller.ProvaController;
import model.Atividade;
import model.Prova;

public class Teste {

	public static void main(String[] args) {
		Prova p1 = new Prova();
		p1.setMediaAluno(5.15f);
		p1.setNumQuestoes(10);
		
		Atividade t1 = new Atividade();
		t1.setAssunto("LadyGaga");
		t1.setQtndPag(10);

		Prova p2 = new Prova();
		p2.setMediaAluno(10);
		p2.setNumQuestoes(8);

		Atividade t2 = new Atividade();
		t2.setAssunto("Pop Culture");
		t2.setQtndPag(15);
		
		Prova p3 = new Prova();
		p3.setMediaAluno(7.5f);
		p3.setNumQuestoes(15);
		
		Atividade t3 = new Atividade();
		t3.setAssunto("Why Lady Gaga is the queen of Pop");
		t3.setQtndPag(100);
		
		ProvaController pController = new ProvaController();
		pController.criarLista(p1);
		pController.criarLista(p2);
		pController.criarLista(p3);
		
		AtividadeController tController = new AtividadeController();
		tController.criarLista(t1);
		tController.criarLista(t2);
		tController.criarLista(t3);
		
		Prova consultaP = pController.consultarAvaliacao(2);
		System.out.println(consultaP);
		
		Atividade consultaT = tController.consultarAvaliacao(1);
		System.out.println(consultaT);
		
		System.out.println("==================================");
		
		String limparProva = pController.limparLista();
		System.out.println(limparProva);
		
		String limparAtividades = pController.limparLista();
		System.out.println(limparAtividades);
	}

}
