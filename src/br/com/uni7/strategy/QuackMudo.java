package br.com.uni7.strategy;

public class QuackMudo implements ModoGrasnar {
	
	@Override
	public void grasnar() {
		System.out.println("Esse pato não grasna!");
	}

}
