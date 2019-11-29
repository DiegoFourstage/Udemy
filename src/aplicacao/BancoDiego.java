/*
Numero da conta, nome do Titular, Tem depostio inicial (y\n),
*/
package aplicacao;

import entidades.BancoDiegoDeposito;
import java.util.Locale;
import java.util.Scanner;

public class BancoDiego {
    public static void main (String [] args){
        
        BancoDiegoDeposito bancodiegodeposito;
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Numero da conta:");
        int numero = sc.nextInt();
        System.out.print("Nome do titular: ");
        sc.nextLine();
        String titular = sc.nextLine();
        System.out.print("Tem deposito inicial (y/n)");
        char resposta = sc.next().charAt(0);
        
        if(resposta == 'y'){
            System.out.print("Valor para depositar: ");
            double inicialDeposito = sc.nextDouble();
            bancodiegodeposito = new BancoDiegoDeposito(numero,titular, inicialDeposito);
        }
        else{
            bancodiegodeposito = new BancoDiegoDeposito(numero, titular);
        }
        
        System.out.println();
        System.out.println("Valor atualizado:");
        System.out.println(bancodiegodeposito);
        
        System.out.println();
        System.out.println("Depositar mais: ");
        double depositoValor = sc.nextDouble();
        bancodiegodeposito.deposito(depositoValor);
        System.out.println("Valor atualizado:");
        System.out.println(bancodiegodeposito);
        
        System.out.println();
        System.out.println("Valor sacado:");
        double saqueValor = sc.nextDouble();
        bancodiegodeposito.saque(depositoValor);
        System.out.println("Valor atualizado:");
        System.out.println(bancodiegodeposito);
        
}

}