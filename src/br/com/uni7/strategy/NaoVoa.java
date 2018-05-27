package br.com.uni7.strategy;

public class NaoVoa implements ModoVoar {

	@Override
	public void voar() {
		System.out.println("Este pato nao voa!");
	}

}
