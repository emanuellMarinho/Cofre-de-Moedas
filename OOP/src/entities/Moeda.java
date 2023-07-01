package entities;

public abstract class Moeda {
	protected double valor;
	public abstract String info();
	public abstract double converter();
}
