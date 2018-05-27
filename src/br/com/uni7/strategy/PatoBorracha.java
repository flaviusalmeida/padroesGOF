package br.com.uni7.strategy;

public class PatoBorracha extends Pato {

	public PatoBorracha() {
		modoGrasnar = new QuackMudo();
		modoVoar = new NaoVoa();
	}

	@Override
	public void exibir() {
		System.out.println("Sou um pato de borracha!");
	}

}
