package entities;

import java.util.ArrayList;

public class MetodosCofrinho {
	private ArrayList<Moeda> listMoedas = new ArrayList<>();

	// [1] Adiciona moedas ao Array
	public void adicionarMoeda(Moeda moeda) {
		listMoedas.add(moeda);
	}

	// [2] Remove moedas do Array
	public void removerMoeda(Moeda moeda) {
		listMoedas.remove(moeda);
	}

	// [3] Listar moedas do Array
	public void listarMoedas() {
		for (Moeda moeda : listMoedas) {
			System.out.println(moeda.info());
		}
	}

	// [4] Calcular total convertido para Real
	public void convertidoReal() {
		double total = 0;
		for (Moeda moeda : listMoedas) {
			total += moeda.converter();
		}
		System.out.println("Total convertido para Real: " + total);
	}

}
