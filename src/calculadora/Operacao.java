package view;

public abstract class Operacao implements Interface
{
    private float valor1;
    private float valor2;
    
    public Operacao(float valor1,float valor2){
        this.valor1 = valor1;
        this.valor2 = valor2;
    }
    
    
    public float getValor1() {
		return valor1;
	}


	public void setValor1(float valor1) {
		this.valor1 = valor1;
	}


	public float getValor2() {
		return valor2;
	}


	public void setValor2(float valor2) {
		this.valor2 = valor2;
	}


	public abstract float getResultado();
}
