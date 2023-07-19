package entities;

import java.util.ArrayList;

public class MetodosCofrinho {
    public ArrayList<Moeda> listMoedas = new ArrayList<Moeda>();

    // [1] Adicionar moedas ao ArrayList
    public void adicionarMoeda(Moeda moeda) {
        listMoedas.add(moeda);
    }

    // [2] Remover moedas do ArrayList
    public void removerMoeda(Moeda moeda) {
        listMoedas.remove(moeda);
    }

    // [3] Listar moedas do ArrayList
    public void listarMoedas() {
        for (int i = 0; i < listMoedas.size(); i++) {
            Moeda moeda = listMoedas.get(i);
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
    
    // Retorna lista de Moedas
    public ArrayList<Moeda> getListMoedas() {
        return listMoedas;
    }
}
