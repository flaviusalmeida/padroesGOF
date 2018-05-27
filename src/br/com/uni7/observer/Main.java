package br.com.uni7.observer;

public class Main {

	public static void main(String[] args) {
		DadosTempo dadosDoTempo = new DadosTempo();
		
		TelaCondicoesAtuais telaCondicoesAtuais = new TelaCondicoesAtuais(dadosDoTempo);
		// TelaEstatisticas telaEstatisticas = new TelaEstatisticas(dadosDoTempo);
		// TelaPrevisao telaPrevisao = new TelaPrevisao(dadosDoTempo);
		
		dadosDoTempo.setMedicoes(30, 65, 30.4F);
		dadosDoTempo.setMedicoes(34, 70, 29.2F);
		dadosDoTempo.setMedicoes(28, 98, 29.2F);

	}

}
