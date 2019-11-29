/*
A dona de um pensionato possui dez quartos para alugar parae studantes, sendo essesq uartos identificados pelos números 0 a 9.
Fazer um programa que inicie com todos os dez quartos vazios, e depois leia uma quantidade N representando 
o número de estudantes que vão alugar quartos (N pode ser de 1 a 10). Em seguida, registre o aluguel dos N estudantes. 
Para cada registro de aluguel, informar o nome e email do estudante, bem como qual dos quartos ele escolheu (de 0 a 9). 
Suponha quesejaescolhidoumquartovago.Aofinal,seuprogramadeveimprimir um relatório de todas ocupações do pensionato, 
por ordem de quarto, conformeexemplo.
*/

package entidades;

public class Rent {
    
    public String name;
    public String email;
    
    //Construtor, tem que ser o mesmo nome da classe.
    public Rent (String name, String email){
        this.name = name;
        this.email = email;
    }
    
    public String getName (){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    
    public String toString(){
        return "Name: "
                + name
                +", "
                +"Email: "
                + email
                +". ";
    }
}
