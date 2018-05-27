package br.com.uni7.observer;

public class TelaCondicoesAtuais implements Observer, ExibirElemento {

	private float temperatura;
	private float umidade;
	private float pressao;
	private Subject dadosDoTempos;

	public TelaCondicoesAtuais(Subject dadosDoTempos) {
		this.dadosDoTempos = dadosDoTempos;
		this.dadosDoTempos.registrarObservadores(this);
	}

	@Override
	public void exibir() {
		System.out.println("\n======== TELA CONDIÇÕES ATUAIS =========");
		System.out.println("Condições atuais: " + temperatura + "ºC e " + umidade + "% de umidade");
	}

	@Override
	public void atualizar(float temperatura, float umidade, float pressao) {
		setTemperatura(temperatura);
		setUmidade(umidade);
		setPressao(pressao);
		exibir();
	}

	public float getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(float temperatura) {
		this.temperatura = temperatura;
	}

	public float getUmidade() {
		return umidade;
	}

	public void setUmidade(float umidade) {
		this.umidade = umidade;
	}

	public Subject getDadosDoTempos() {
		return dadosDoTempos;
	}

	public void setDadosDoTempos(Subject dadosDoTempos) {
		this.dadosDoTempos = dadosDoTempos;
	}

	public float getPressao() {
		return pressao;
	}

	public void setPressao(float pressao) {
		this.pressao = pressao;
	}

}
