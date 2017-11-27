package view;

public abstract class Operacao<T extends Number> implements Interface<Number>
{
    private T valor1;
    private T valor2;
    
    public Operacao(T valor12,T valor22){
        this.valor1 = valor12;
        this.valor2 = valor22;
    }
    
    
    public T getValor1() {
		return valor1;
	}


	public void setValor1(T valor1) {
		this.valor1 = valor1;
	}


	public T getValor2() {
		return valor2;
	}


	public void setValor2(T valor2) {
		this.valor2 = valor2;
	}


	public abstract Number getResultado();
}
