package br.com.uni7.strategy;

public class Main {

	public static void main(String[] args) {
		Pato p = new PatoSelvagem();
		p.exibir();
		p.executarGrasno();
		p.executarVoo();
		System.out.println(" ");
		
		p = new PatoBorracha();
		p.exibir();
		p.executarGrasno();
		p.executarVoo();
		System.out.println(" ");
		
		p = new PatoCabecaVermelha();
		p.exibir();
		p.executarGrasno();
		p.executarVoo();
		System.out.println(" ");
	}
}
