/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacao;

import entidades.CalculoMetodosInstanciados;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Udemy
 */
public class MainCirculoInstanciados {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        CalculoMetodosInstanciados calc = new CalculoMetodosInstanciados();
        
        double raio = sc.nextDouble();
        
        
        System.out.printf("Raio da Circunferencia %.2f%n", calc.circunferencia(raio));
        System.out.printf("Volume do Circulo %.2f%n ", calc.volume(raio));
        System.out.printf("Valor do PI: ", calc.PI);        
        
    }
    
}
