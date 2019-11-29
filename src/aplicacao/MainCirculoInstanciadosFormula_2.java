
package aplicacao;

import entidades.CalculoMetodosInstanciados;
import java.util.Locale;
import java.util.Scanner;


public class MainCirculoInstanciadosFormula_2 {
    
    public static void main (String [] args){
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        CalculoMetodosInstanciados calc_2 = new CalculoMetodosInstanciados();
        
        double raio = sc.nextDouble();
        
        double c = calc_2.circunferencia(raio);
        double v = calc_2.volume(raio);
        
        System.out.printf("Circunferencia %.2f%n", c);
        System.out.printf("Volume %.2f%n", v);
        System.out.printf("PI: %.2f%n", calc_2.PI);
        
        
    }
    
}
