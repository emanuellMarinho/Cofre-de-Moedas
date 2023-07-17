package entities;

public class Euro extends Moeda {

	@Override
	public String info() {
		return "Euro";
	}

	@Override
	public double converter() {
		// valor do Euro no dia 10/07/2023
		// 5,39 -> 1 Euro
		double valorEmEuro = this.valor;
		double taxaDeConversao = 5.39;
		double valorConvertido = valorEmEuro * taxaDeConversao;
		return valorConvertido;
	}
	
	@Override
    public void setValor(double valor) {
        super.setValor(valor);
    }
}
