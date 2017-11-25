package view;

public class Divisao extends Operacao
{
   
   public Divisao(float valor1,float valor2){
      super(valor1, valor2);
    }
   public float getResultado(){
       return super.getValor1()/super.getValor2();
    }
}