package br.com.uni7.observer;

public interface Subject {

	void registraObservadores(Observer observer);

	void removerObservadores(Observer observer);

	void notificarObservadores();

}
