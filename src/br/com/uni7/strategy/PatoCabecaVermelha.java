package br.com.uni7.strategy;

public class PatoCabecaVermelha extends Pato {

	public PatoCabecaVermelha() {
		modoGrasnar = new Squeak();
		modoVoar = new VoarAsas();
	}

	@Override
	public void exibir() {
		System.out.println("Sou um pato da cabeça vermelha!");
	}

}
