package view;

public class Porcentagem<T extends Number> extends Operacao<Number>{
   private final Class<T> type;
	
   public Porcentagem(T valor1, T valor2, Class<T> type){
       super( valor1, valor2);
       this.type = type;
    }
   
   public Class<T> getMyType() {
       return this.type;
   }

   public Number getResultado(){
	   if(this.getMyType().equals(float.class)){
		  return (getValor1().floatValue() * getValor2().floatValue())/100;
	   }else{
		   return (getValor1().intValue() / getValor2().intValue())/100;
	   }
      
    }
}
