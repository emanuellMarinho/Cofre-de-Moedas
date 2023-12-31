package entities;

public abstract class Moeda {
	
	// Construtor
	public void setValor(double valor) {
        this.valor = valor;
    }
	
	public double getValor() {
        return valor;
    }
	
	protected double valor;
	public abstract String info();
	public abstract double converter();	
}
