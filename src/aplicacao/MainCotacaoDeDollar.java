/*
Faça um programa para ler cotação do dólar, e depois um valor em dólares a ser comprado por
uma pessoa em reais. Informar qantos reais a pessoa vai pagar pelo dólares, considerandoa ainda
que a pessoa terá que pagar 6% de IOF sobre o valor em dólar. Criar uma classe Converter
pra ser responsável pelos cálculos.
Preço do doolar? 3.10 
Quantidade comprada em dollar? 200.00 
Resultado = 657.20 imposto de 6%
*/
package aplicacao;

import entidades.CotacaoDollarCalculo;
import java.util.Locale;
import java.util.Scanner;


public class MainCotacaoDeDollar {
    
   public static void main (String [] args){
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    
    CotacaoDollarCalculo calcular = new CotacaoDollarCalculo();
    
    calcular.doolar = sc.nextDouble();
    
    calcular.real = sc.nextDouble();
    
    calcular.total = calcular.doolar * calcular.real;
    
    System.out.printf("Resultado %.2f%n", calcular.calculo());
    
    
    
    
       
   }
    
    
}
