
package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class VetorParte1 {
    
    public static void main (String [] args){
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int n, i;
        double[] vect;
        double total;
        double soma = 0.0;
        
        System.out.print("Digite quantidade de valor do vetor: ");
        n = sc.nextInt();
        vect = new double [n];
        
        for (i = 0; i < n; i++){
            System.out.print("Digite altura: ");
            vect[i] = sc.nextDouble();
        }
        for (i = 0; i < n; i++){
            soma+=vect[i];
        }
        
        total = soma / n;
        
        System.out.printf("Resultado: %.2f%n ", total);
    }
    
}
