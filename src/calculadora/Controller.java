package view;

public class Controller {
	
	private int value1int;
	private int value2int;
	
	private int operator;
	
	private float value1f;
	private float value2f;
	
	public Controller(){
		
	}
	
	public void startI(int value, int op){
		this.value1int = value;
		this.operator = op;
	}
	
	public void startf(float value, int op){
		this.value1f = value;
		this.operator = op;
	}
	
	public int getValueI(int value2){
		this.value2int = value2;
		
		if(this.operator == 1){
			Soma<Integer> s = new Soma<Integer>(this.value1int, this.value2int, Integer.class);
			return (int)(s.getResultado());
		}
		else if (this.operator == 2){
			Subtracao<Integer> s = new Subtracao<Integer>(this.value1int, this.value2int, Integer.class);
			return (int)(s.getResultado());
		}
		else if (this.operator == 3){
			Multiplicacao<Integer> s = new Multiplicacao<Integer>(this.value1int, this.value2int, Integer.class);
			return (int)(s.getResultado());
		}
		else{
			Divisao<Integer> s = new Divisao<Integer>(this.value1int, this.value2int, Integer.class);
			return (int)(s.getResultado());
		}
		
	}
		
	public int getValue1int() {
		return value1int;
	}

	public void setValue1int(int value1int) {
		this.value1int = value1int;
	}

	public float getValue1f() {
		return value1f;
	}

	public void setValue1f(float value1f) {
		this.value1f = value1f;
	}

	public float getValuef(float value2){
		this.value2f = value2;
		
		if(this.operator == 1){
			Soma<Float> s = new Soma<Float>(this.value1f,this.value2f , float.class);
			return (float)(s.getResultado());
		}
		else if (this.operator == 2){
			Subtracao<Float> s = new Subtracao<Float>(this.value1f,this.value2f , float.class);
			return (float)(s.getResultado());
		}
		else if (this.operator == 3){
			Multiplicacao<Float> s = new Multiplicacao<Float>(this.value1f,this.value2f , float.class);
			return (float)(s.getResultado());
		}
		else{
			Divisao<Float> s = new Divisao<Float>(this.value1f,this.value2f , float.class);
			return (float)(s.getResultado());
		}
			
	}

	public int getOperator() {
		return operator;
	}

	public void setOperator(int operator) {
		this.operator = operator;
	}
	
}
