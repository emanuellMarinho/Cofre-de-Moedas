package entities;

public class Dolar extends Moeda {

	@Override
	public String info() {
		return "Dólar";
	}

	@Override
	public double converter() {
		// valor do Dólar no dia 10/07/2023
		// 4,20 ->  1 Dólar
		double valorEmDolar = this.valor;
		double taxaDeConversao = 4.90;
		double valorConvertido = valorEmDolar * taxaDeConversao;
		return valorConvertido;
	}
	
	@Override
    public void setValor(double valor) {
        super.setValor(valor);
    }
}