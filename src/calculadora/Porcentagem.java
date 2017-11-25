package view;

public class Porcentagem extends Operacao
{
   
   public Porcentagem(float valor1,float valor2){
       super( valor1, valor2);
    }
   public float getResultado(){
	   return (super.getValor1())*(super.getValor2()/100);
    }
}