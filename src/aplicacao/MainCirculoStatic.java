/*
Nessa clase não precisamos instanciar uma classe do tipo objeto, apenas atribuimos a classe.Metodo(raio) a uma variacel
exemplo nas variaveis c e v
*/
package aplicacao;

import entidades.CalculoMetodoStatic;
import java.util.Locale;
import java.util.Scanner;

public class MainCirculoStatic {
    
    public static void main (String [] args){
        
       Locale.setDefault(Locale.US);
       Scanner sc = new Scanner(System.in);
       
       double raio = sc.nextDouble();
       
       double c = CalculoMetodoStatic.circunferencia(raio);
       double v = CalculoMetodoStatic.volume(raio);
       
       System.out.printf("Circunferencia %.2f%n", c);
       System.out.printf("volume %.2f", v);
       System.out.printf("PI %.2f ", CalculoMetodoStatic.PI);
       
        
    }
    
}
