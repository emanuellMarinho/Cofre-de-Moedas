package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Dolar;
import entities.Euro;
import entities.MetodosCofrinho;
import entities.Moeda;
import entities.Real;

public class Cofrinho {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		MetodosCofrinho metodos = new MetodosCofrinho();

		int opcao = -1;

		while (opcao != 0) {
			
			System.out.println("COFRINHO:");
			System.out.println("[1] Adicionar Moeda");
			System.out.println("[2] Remover Moeda");
			System.out.println("[3] Listar Moedas");
			System.out.println("[4] Calcular total convertido para Real");
			System.out.println("[0] Encerrar");
			
			opcao = sc.nextInt();
			
			switch (opcao) {
			case 1:
				int tipoMoeda = 0;
				while (tipoMoeda < 1 || tipoMoeda > 3) {
					// Adcionar
					System.out.print("Escolha uma Moeda:\n");
					System.out.print("1-Real:\n");
					System.out.print("2-Dolar:\n");
					System.out.print("3-Euro:\n");
					
					tipoMoeda = sc.nextInt();
				
					if (tipoMoeda == 1) {
					    System.out.println("Digite o valor:");
					    double valorReal = sc.nextDouble();
					    Moeda moedaReal = new Real();
					    moedaReal.setValor(valorReal);
					    metodos.adicionarMoeda(moedaReal);
					    break;
					}
					else if (tipoMoeda == 2) {
					    System.out.println("Digite o valor:");
					    double valorDolar = sc.nextDouble();
					    Moeda moedaDolar = new Dolar();
					    moedaDolar.setValor(valorDolar);
					    metodos.adicionarMoeda(moedaDolar);
					    break;
					}
					else if (tipoMoeda == 3) {
					    System.out.println("Digite o valor:");
					    double valorEuro = sc.nextDouble();
					    Moeda moedaEuro = new Euro();
					    moedaEuro.setValor(valorEuro);
					    metodos.adicionarMoeda(moedaEuro);
					    break;
					}
				}
				break;
			case 2:
				// Remover
				break;
			case 3:
				// Listar
				MetodosCofrinho metodosCofrinho = new MetodosCofrinho();
				metodosCofrinho.listarMoedas();
				break;
			case 4:
				// Total para Real
			default:
				System.out.println("Encerrando...");

			}
		}

		sc.close();
	}
}
