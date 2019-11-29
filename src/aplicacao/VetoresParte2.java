
package aplicacao;

import entidades.VetoresParte2_MeGeSet;
import java.util.Locale;
import java.util.Scanner;

public class VetoresParte2 {
    
    public static void main (String [] args){
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
      int n = sc.nextInt();
      VetoresParte2_MeGeSet[] vect =  new VetoresParte2_MeGeSet[n];
     
      
      for (int i = 0; i<vect.length; i++){
          sc.nextLine();
          String name = sc.nextLine();          
          double preco = sc.nextDouble();
          vect[i] = new VetoresParte2_MeGeSet(name, preco);
      }
        double soma = 0.0;
        for (int i = 0; i<vect.length; i++){
        soma += vect[i].getPreco();
    }
        double media = soma / vect.length;
        System.out.printf("Média %.2f%n", media);
        
    }
}
