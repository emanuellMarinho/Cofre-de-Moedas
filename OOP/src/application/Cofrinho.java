package application;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import entities.Dolar;
import entities.Euro;
import entities.MetodosCofrinho;
import entities.Moeda;
import entities.Real;

/*
 * 
 * Autor: Emanuel Marinho
 * 
 */

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

            try {
                opcao = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Opção inválida. Digite um número válido.");
                sc.nextLine();
                continue;
            }

            switch (opcao) {
                case 1:
                    // Adicionar
                    int tipoMoeda = 0;
                    while (tipoMoeda < 1 || tipoMoeda > 3) {
                        System.out.println("Escolha uma Moeda:");
                        System.out.println("1-Real:");
                        System.out.println("2-Dolar:");
                        System.out.println("3-Euro:");

                        try {
                            tipoMoeda = sc.nextInt();
                        } catch (InputMismatchException e) {
                            System.out.println("Opção inválida. Digite um número válido.");
                            sc.nextLine();
                            continue;
                        }

                        if (tipoMoeda == 1) {
                            System.out.println("Digite o valor:");
                            try {
                                double valorReal = sc.nextDouble();
                                Moeda moedaReal = new Real();
                                moedaReal.setValor(valorReal);
                                metodos.adicionarMoeda(moedaReal);
                                break;
                            } catch (InputMismatchException e) {
                                System.out.println("Valor inválido. Digite um número válido.");
                                sc.nextLine();
                                continue;
                            }
                        } else if (tipoMoeda == 2) {
                            System.out.println("Digite o valor:");
                            try {
                                double valorDolar = sc.nextDouble();
                                Moeda moedaDolar = new Dolar();
                                moedaDolar.setValor(valorDolar);
                                metodos.adicionarMoeda(moedaDolar);
                                break;
                            } catch (InputMismatchException e) {
                                System.out.println("Valor inválido. Digite um número válido.");
                                sc.nextLine();
                                continue;
                            }
                        } else if (tipoMoeda == 3) {
                            System.out.println("Digite o valor:");
                            try {
                                double valorEuro = sc.nextDouble();
                                Moeda moedaEuro = new Euro();
                                moedaEuro.setValor(valorEuro);
                                metodos.adicionarMoeda(moedaEuro);
                                break;
                            } catch (InputMismatchException e) {
                                System.out.println("Valor inválido. Digite um número válido.");
                                sc.nextLine();
                                continue;
                            }
                        }
                    }
                    break;
                case 2:
                    // Remover
                    int tipoRemoverMoeda = 0;
                    while (tipoRemoverMoeda < 1 || tipoRemoverMoeda > 3) {
                        System.out.println("Escolha uma Moeda para remover:");
                        System.out.println("1-Real:");
                        System.out.println("2-Dolar:");
                        System.out.println("3-Euro:");

                        try {
                            tipoRemoverMoeda = sc.nextInt();
                        } catch (InputMismatchException e) {
                            System.out.println("Opção inválida. Digite um número válido.");
                            sc.nextLine();
                            continue;
                        }

                        if (tipoRemoverMoeda == 1) {
                            System.out.println("Digite o valor:");
                            try {
                                double valorReal = sc.nextDouble();
                                int indiceRemover = -1;

                                ArrayList<Moeda> listMoedas = metodos.getListMoedas();

                                for (int i = 0; i < listMoedas.size(); i++) {
                                    Moeda moeda = listMoedas.get(i);

                                    if (moeda instanceof Real && moeda.getValor() == valorReal) {
                                        indiceRemover = i;
                                        break;
                                    }
                                }

                                if (indiceRemover != -1) {
                                    listMoedas.remove(indiceRemover);
                                    System.out.println("Moeda removida com sucesso!");
                                } else {
                                    System.out.println("Moeda não encontrada na lista.");
                                }
                                break;
                            } catch (InputMismatchException e) {
                                System.out.println("Valor inválido. Digite um número válido.");
                                sc.nextLine();
                                continue;
                            }
                        } else if (tipoRemoverMoeda == 2) {
                            System.out.println("Digite o valor:");
                            try {
                                double valorDolar = sc.nextDouble();
                                int indiceRemover = -1;

                                ArrayList<Moeda> listMoedas = metodos.getListMoedas();

                                for (int i = 0; i < listMoedas.size(); i++) {
                                    Moeda moeda = listMoedas.get(i);

                                    if (moeda instanceof Dolar && moeda.getValor() == valorDolar) {
                                        indiceRemover = i;
                                        break;
                                    }
                                }

                                if (indiceRemover != -1) {
                                    listMoedas.remove(indiceRemover);
                                    System.out.println("Moeda removida com sucesso!");
                                } else {
                                    System.out.println("Moeda não encontrada na lista.");
                                }
                                break;
                            } catch (InputMismatchException e) {
                                System.out.println("Valor inválido. Digite um número válido.");
                                sc.nextLine();
                                continue;
                            }
                        } else if (tipoRemoverMoeda == 3) {
                            System.out.println("Digite o valor:");
                            try {
                                double valorEuro = sc.nextDouble();
                                int indiceRemover = -1;

                                ArrayList<Moeda> listMoedas = metodos.getListMoedas();

                                for (int i = 0; i < listMoedas.size(); i++) {
                                    Moeda moeda = listMoedas.get(i);

                                    if (moeda instanceof Euro && moeda.getValor() == valorEuro) {
                                        indiceRemover = i;
                                        break;
                                    }
                                }

                                if (indiceRemover != -1) {
                                    listMoedas.remove(indiceRemover);
                                    System.out.println("Moeda removida com sucesso!");
                                } else {
                                    System.out.println("Moeda não encontrada na lista.");
                                }
                                break;
                            } catch (InputMismatchException e) {
                                System.out.println("Valor inválido. Digite um número válido.");
                                sc.nextLine();
                                continue;
                            }
                        }
                    }
                    break;
                case 3:
                    // Listar
                    metodos.listarMoedas();
                    break;
                case 4:
                    // Total para Real
                    metodos.convertidoReal();
                    break;
                default:
                    System.out.println("Encerrando...");
                    break;
            }
        }

        sc.close();
    }
}
