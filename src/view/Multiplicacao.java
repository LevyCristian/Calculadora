package view;

public class Multiplicacao<T extends Number> extends Operacao<Number>{
   private final Class<T> type;
	
   public Multiplicacao(T valor1, T valor2, Class<T> type){
       super( valor1, valor2);
       this.type = type;
    }
   
   public Class<T> getMyType() {
       return this.type;
   }

   public Number getResultado(){
	   if(this.getMyType().equals(float.class)){
		   float number1 = getValor1().floatValue()
		   float number2 = getValor2().floatValue();
		   return  number1 * number2
	   }else{
		   return getValor1().intValue() * getValor2().intValue();
	   }
      
    }
}
