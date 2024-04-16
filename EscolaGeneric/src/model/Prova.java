package model;

public class Prova {
	
	private int numQuestoes;
	private float mediaAluno;
	
	public Prova() {
		super();
	}

	public int getNumQuestoes() {
		return numQuestoes;
	}

	public void setNumQuestoes(int numQuestoes) {
		this.numQuestoes = numQuestoes;
	}

	public float getMediaAluno() {
		return mediaAluno;
	}

	public void setMediaAluno(float mediaAluno) {
		this.mediaAluno = mediaAluno;
	}
	
	@Override
	public String toString() {
		return "Prova com " + numQuestoes + " questões e o aluno tirou " + mediaAluno;
	}

}
