
package entidades;

public class VetoresParte2_MeGeSet {
    
    private String name;
    private double preco;
    
    //Construtores
    public VetoresParte2_MeGeSet(String name, double preco){
        this.name = name;
        this.preco = preco;
    }
   
    //Metodos Gets e Sets
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public double getPreco(){
        return preco;
    }
    
    public void setPreco(double preco){
        this.preco = preco;
    }
    
}
