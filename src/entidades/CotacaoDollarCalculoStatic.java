
package entidades;

public class CotacaoDollarCalculoStatic {
    
    public static final double IMPOSTO = 0.06;
    public static double doolar;
    public static double real;
    public static double total;
    
    public static double calculo(){
        return IMPOSTO * doolar * real + total;
    }
    
    
}
