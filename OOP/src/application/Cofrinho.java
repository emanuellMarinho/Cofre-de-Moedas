package application;

import java.util.Scanner;
import entities.MetodosCofrinho;

public class Cofrinho {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		MetodosCofrinho metodos = new MetodosCofrinho();

		int opcao;

		System.out.println("COFRINHO:");
		System.out.println("[1] Adicionar Moeda");
		System.out.println("[2] Remover Moeda");
		System.out.println("[3] Listar Moedas");
		System.out.println("[4] Calcular total convertido para Real");
		System.out.println("[0] Encerrar");

		opcao = sc.nextInt();

		while (opcao != 0) {
			switch (opcao) {
			case 1:
				int tipoMoeda = 0;
				while (tipoMoeda > 2 || tipoMoeda <= 3) {
					// Adcionar
					System.out.print("1. Real: ");
					System.out.print("2. Dolar: ");
					System.out.print("3. Euro: ");
				}
				// Tratamento dos dados
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
