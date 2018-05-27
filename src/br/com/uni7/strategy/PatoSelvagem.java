package br.com.uni7.strategy;

public class PatoSelvagem extends Pato {

	public PatoSelvagem() {
		modoGrasnar = new Quack();
		modoVoar = new VoarAsas();
	}

	@Override
	public void exibir() {
		System.out.println("Sou um pato selvagem!");
	}
}
