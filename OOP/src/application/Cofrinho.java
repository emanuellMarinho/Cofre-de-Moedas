package application;

import java.util.ArrayList;

public class Cofrinho{
	private ArrayList<String> listMoedas = new ArrayList<>();
	
	// Adiciona moedas ao Array
	public void adicionarMoeda(String moeda) {
		listMoedas.add(moeda);
	}
	
	// Remove moedas do Array
	public void removerMoeda(String moeda) {
		listMoedas.remove(moeda);
	}

}
