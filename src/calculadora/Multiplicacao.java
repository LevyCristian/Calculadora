package view;

public class Multiplicacao extends Operacao
{
   
   public Multiplicacao(float valor1,float valor2){
       super( valor1, valor2);
    }
   public float getResultado(){
       return super.getValor1()*super.getValor2();
    }
}
