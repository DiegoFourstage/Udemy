/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacao;

import entidades.CotacaoDollarCalculoStatic;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Udemy
 */
public class MainCotacaoDeDollarStatic {
    
    public static void main (String [] args){
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        CotacaoDollarCalculoStatic.doolar = sc.nextDouble();
        CotacaoDollarCalculoStatic.real = sc.nextDouble();
        CotacaoDollarCalculoStatic.total = CotacaoDollarCalculoStatic.doolar * CotacaoDollarCalculoStatic.real;
        
        System.out.printf("Resultado %.2f%n", CotacaoDollarCalculoStatic.calculo());
        
        
        
        
    }
    
}
