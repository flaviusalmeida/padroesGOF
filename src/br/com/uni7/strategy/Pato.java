package br.com.uni7.strategy;

public class Pato {
	
	ModoGrasnar modoGrasnar;
	ModoVoar modoVoar;
	
	public void executarGrasno() {
		modoGrasnar.grasnar();
	}
	
	public void executarVoo() {
		modoVoar.voar();
	}
	
	public void nadar() {
		System.out.println("Estou nadando...");
	}
	
	public void exibir() {
		System.out.println("Sou um pato!");
	}

}
