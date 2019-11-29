/*
Valor do PI 3,14159, não podendo ser ele mudado (final antes do double)
Metodos circuferencia triangulo 2 * PI * raio
Metodos volume do triangulo 4.0 * PI * raio * raio * raio / 3.0
*/
package entidades;

public class CalculoMetodoStatic {
    
    public static final double PI = 3.14159;
    
    public static double circunferencia (double raio){
        return 2.0 * PI * raio;
    }
    public static double volume (double raio){
        return 4.0 * PI * raio * raio * raio / 3.0;
    }
    
}
