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
			return (int)(this.value1int + this.value2int);
		}
		else if (this.operator == 2){
			return (int)(this.value1int - this.value2int);
		}
		else if (this.operator == 3){
			return (int)(this.value1int * this.value2int);
		}
		else{
			return (int)(this.value1int / this.value2int);
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
		System.out.println(this.operator);	
		if(this.operator == 1){
			return (float) (this.value1f + this.value2f);
		}
		else if(this.operator == 2){
			return (float) (this.value1f - this.value2f);
		}
		else if(this.operator == 3){
			return (float) (this.value1f * this.value2f);
		}
		else{
			return (float) (this.value1f / this.value2f);
		}
			
	}

	public int getOperator() {
		return operator;
	}

	public void setOperator(int operator) {
		this.operator = operator;
	}
	
}
