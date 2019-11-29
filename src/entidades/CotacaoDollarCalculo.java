
package entidades;

public class CotacaoDollarCalculo {
    
    public final double IMPOSTO = 0.06;
    
    public double doolar;
    public double real;
    public double total;
    
    
    public double calculo (){
        return  IMPOSTO * doolar * real + total;
    }
    
}
