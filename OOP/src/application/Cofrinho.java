package application;

import java.util.ArrayList;
import java.util.Scanner;
import entities.Moeda;

public class Cofrinho {

	// Adiciona moedas ao Array
	private ArrayList<Moeda> listMoedas = new ArrayList<>();

	// Adiciona moedas ao Array
	public void adicionarMoeda(Moeda moeda) {
		listMoedas.add(moeda);
	}

	// Remove moedas do Array
	public void removerMoeda(Moeda moeda) {
		listMoedas.remove(moeda);
	}

	// Listar moedas do Array
	public void listarMoedas() {
		for (Moeda moeda : listMoedas) {
			System.out.println(moeda.info());
		}
	}

	// Calcular total convertido para Real
	public void convertidoReal() {
		double total = 0;
		for (Moeda moeda : listMoedas) {
			total += moeda.converter();
		}
		System.out.println("Total convertido para Real: " + total);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int opcao;

		System.out.println("[1] Adicionar Moeda");
		System.out.println("[2] Remover Moeda");
		System.out.println("[3] Listar Moedas");
		System.out.println("[4] Calcular total convertido para Real");
		System.out.println("[0] Encerrar");

		opcao = sc.nextInt();

		while (opcao != 0) {
			switch (opcao) {
			case 1:
				// Adcionar
				break;
			case 2:
				// Remover
				break;
			case 3:
				// Listar
				break;
			case 4:
				// Total para Real
			default:
				System.out.println("Opção Inválida");

			}
		}

		sc.close();
	}
}
