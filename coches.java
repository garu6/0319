
/**
 * Write a description of class coches here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class coches
{
    // instance variables - replace the example below with your own
    private String marca;
    private String modelo;
    private String color;
    private int añoFabricacion;
    private int kilometros;
    private int potencia;

    /**
     * Constructor for objects of class coches
     */
    public coches( String marca, String modelo, String color, int añoFabricacion , int potencia )
    {
        kilometros =0;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.añoFabricacion = añoFabricacion;
        this.potencia = potencia;
    }
    
    
    public void getDetails(){
        System.out.println(marca + modelo + añoFabricacion + potencia);
        
    }
    
    
    public void setkilometros(int kilometrosCoche){
        kilometros = kilometrosCoche;
    }
    
    public int getKilometros(){
        return kilometros;
        
    }
    
    
    public int getPotencia(){
        return potencia;
    }
    
    
    public String getMArca(){
        return marca;
}

public  int getAñoFabricacion(){
    return añoFabricacion;
}
   }