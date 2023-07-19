package entities;

public class Real extends Moeda {

	@Override
	public String info() {
		return "Real: " + this.valor;
	}

	@Override
	public double converter() {
		// valor do Real no dia 10/07/2023
		// 0,20 ->  vinte centavos de Real
		double valorEmReal = this.valor;
		double taxaDeConversao = 0.20;
		double valorConvertido = valorEmReal * taxaDeConversao;
		return valorConvertido;
	}
	
	@Override
    public void setValor(double valor) {
        super.setValor(valor);
    }

}
