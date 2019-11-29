/*
A dona de um pensionato possui dez quartos para alugar parae studantes, sendo essesq uartos identificados pelos números 0 a 9.
Fazer um programa que inicie com todos os dez quartos vazios, e depois leia uma quantidade N representando 
o número de estudantes que vão alugar quartos (N pode ser de 1 a 10). Em seguida, registre o aluguel dos N estudantes. 
Para cada registro de aluguel, informar o nome e email do estudante, bem como qual dos quartos ele escolheu (de 0 a 9). 
Suponha quesejaescolhidoumquartovago.Aofinal,seuprogramadeveimprimir um relatório de todas ocupações do pensionato, 
por ordem de quarto, conformeexemplo.
*/
package aplicacao;

import entidades.Rent;
import java.util.Scanner;

public class MainRent {
    
    public static void main (String [] args){
        
        Scanner sc = new Scanner (System.in);
        
        Rent[] vect = new Rent[10]; //Chamando vetor com dados em outra classe.
        int n = sc.nextInt(); // Dando valor a variavel numero.
        
        //Lógica para passar por todas as caixas dos vetores.
        for (int i = 0; i < n; i++){
            System.out.println();
            System.out.println("Rent " + i + ":");
            System.out.println("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();
            vect[room] = new Rent(name, email);
        }
        
        System.out.println();
        System.out.println("Busy rooms: ");
        for (int i = 0; i < 10; i++){
            if (vect[i] != null){
                System.out.println(i + ": " + vect[i]);
            }
        }
    }
    
}
