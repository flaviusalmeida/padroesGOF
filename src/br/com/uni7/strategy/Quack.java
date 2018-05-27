package br.com.uni7.strategy;

public class Quack implements ModoGrasnar {

	@Override
	public void grasnar() {
		System.out.println("Quack Quack Quack");
	}

}
