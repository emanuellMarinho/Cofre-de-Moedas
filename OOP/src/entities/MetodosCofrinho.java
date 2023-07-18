package entities;

import java.util.ArrayList;
import java.util.List;

public class MetodosCofrinho {
    private List<Moeda> listMoedas;

    // Construtor
    public MetodosCofrinho() {
        listMoedas = new ArrayList<>();
    }

    // Adicionar Moedas
    public void adicionarMoeda(Moeda moeda) {
        listMoedas.add(moeda);
    }

    // Remover Moedas
    public void removerMoeda(Moeda moeda) {
        listMoedas.remove(moeda);
    }

    // Listar Moedas
    public void listarMoedas() {
        for (Moeda moeda : listMoedas) {
            System.out.println(moeda.info());
        }
    }

    // Total convertido para Real
    public void convertidoReal() {
        double total = 0;
        for (Moeda moeda : listMoedas) {
            total += moeda.converter();
        }
        System.out.println("Total convertido para Real: " + total);
    }
}
