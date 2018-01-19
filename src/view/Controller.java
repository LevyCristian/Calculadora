package view;

public class Controller {
	
	private int value1int;
	private int value2int;
	
	private int operator;
	
	private float value1f;
	private float value2f;
	
	private Soma<Integer> sI;
	private Soma<Float> sF;
	
	private Subtracao<Integer> sbI;
	private Subtracao<Float> sbF;
	
	private Multiplicacao<Integer> mI;
	private Multiplicacao<Float> mF;
	
	private Divisao<Integer> dI;
	private Divisao<Float> dF;
	
	private Porcentagem<Float> ps; 
	
	

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
			
			 sI = new Soma<Integer>(this.value1int, this.value2int, Integer.class);
			return (int)(sI.getResultado());
		}
		else if (this.operator == 2){
			 sbI = new Subtracao<Integer>(this.value1int, this.value2int, Integer.class);
			return (int)(sbI.getResultado());
		}
		else if (this.operator == 3){
			mI = new Multiplicacao<Integer>(this.value1int, this.value2int, Integer.class);
			return (int)(mI.getResultado());
		}
		else{
			dI = new Divisao<Integer>(this.value1int, this.value2int, Integer.class);
			return (int)(dI.getResultado());
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
			 sF = new Soma<Float>(this.value1f,this.value2f , float.class);
			return (float)(sF.getResultado());
		}
		else if (this.operator == 2){
			 sbF = new Subtracao<Float>(this.value1f,this.value2f , float.class);
			return (float)(sbF.getResultado());
		}
		else if (this.operator == 3){
			mF = new Multiplicacao<Float>(this.value1f,this.value2f , float.class);
			return (float)(mF.getResultado());
		}
		else if(this.operator == 4){
			dF = new Divisao<Float>(this.value1f,this.value2f , float.class);
			return (float)(dF.getResultado());
		}
		else {
			ps = new Porcentagem<Float>(this.value1f, this.value2f, float.class);
			return (float)(ps.getResultado());
		}
			
	}

	public int getOperator() {
		return operator;
	}

	public void setOperator(int operator) {
		this.operator = operator;
	}
	
}
