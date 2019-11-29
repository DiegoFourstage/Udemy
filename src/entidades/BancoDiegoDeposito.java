package entidades;

public class BancoDiegoDeposito {
    
    private int numero;
    private String titular;
    private double balance;
    
    public BancoDiegoDeposito (int numero, String titular){
        this.numero = numero;
        this.titular = titular;
        
    } 
    public BancoDiegoDeposito (int numero, String titular, double inicialDeposito){
        this.numero = numero;
        this.titular = titular;
        deposito(inicialDeposito);
    } 
    
    public int getNumero(){
        return numero;
    }
    public String getTitular(){
        return titular;
    }
    public String setTitular(){
        return titular;
    }
    public double getBalance(){
        return balance;
    }
    
    public void deposito(double amount){
        balance += amount;
    }
    public void saque (double amount){
        balance -= amount + 5.0;
    }
    public String toString(){
        return "Numero da conta: "
                + numero
                + ", Nome do titular: "
                + titular
                + ", Saldo $"
                + String.format("%.2f " , balance);
    }
}