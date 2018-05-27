package br.com.uni7.observer;

import java.util.ArrayList;

public class DadosTempo implements Subject {

	public ArrayList<Observer> observadores;
	public float temperatura;
	public float umidade;
	public float pressao;

	public DadosTempo() {
		observadores = new ArrayList<Observer>();
	}

	public void medicoesAlteradas() {
		notificarObservadores();
	}

	public void setMedicoes(float temperatura, float umidade, float pressao) {
		this.temperatura = temperatura;
		this.umidade = umidade;
		this.pressao = pressao;
		medicoesAlteradas();
	}

	@Override
	public void registraObservadores(Observer observer) {
		observadores.add(observer);
	}

	@Override
	public void removerObservadores(Observer observer) {

		int index = observadores.indexOf(observer);

		if (index >= 0) {
			observadores.remove(index);
		}
	}

	@Override
	public void notificarObservadores() {
		for (int i = 0; i < observadores.size(); i++) {
			Observer observador = (Observer) observadores.get(i);
			observador.atualizar(temperatura, umidade, pressao);
		}
	}

}
