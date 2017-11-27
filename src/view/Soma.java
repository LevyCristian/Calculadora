package view;

public class Soma<T extends Number> extends Operacao<Number>{
   private final Class<T> type;
	
   public Soma(T valor1, T valor2, Class<T> type){
       super( valor1, valor2);
       this.type = type;
    }
   
   public Class<T> getMyType() {
       return this.type;
   }

   public Number getResultado(){
	   if(this.getMyType().equals(float.class)){
		  return getValor1().floatValue() + getValor2().floatValue();
	   }else{
		   return getValor1().intValue() + getValor2().intValue();
	   }
      
    }
}
