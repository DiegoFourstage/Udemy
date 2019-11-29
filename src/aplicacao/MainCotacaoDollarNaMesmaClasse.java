
package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class MainCotacaoDollarNaMesmaClasse {
    
    public static final double IMPOSTO = 0.06; 
    
    public static double doolar;
    public static double reais;
    public static double total;
    
    public static double calculo(){
        return IMPOSTO * doolar * reais + total;
        
    }
    
    public static void main (String [] args){
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
                     
        System.out.println("Valor do Doolar:");      
        MainCotacaoDollarNaMesmaClasse.doolar = sc.nextDouble();
        System.out.println("Comprar dolar em Real:");
        MainCotacaoDollarNaMesmaClasse.reais = sc.nextDouble();
        
        MainCotacaoDollarNaMesmaClasse.total = MainCotacaoDollarNaMesmaClasse.doolar * MainCotacaoDollarNaMesmaClasse.reais;
               
        
        System.out.printf("Você comprou em doolar %.2f%n",MainCotacaoDollarNaMesmaClasse.calculo());
                
    }  
}
