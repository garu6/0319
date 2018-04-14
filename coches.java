
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
    
    private int indiceObjeto;
    /**
     * Constructor for objects of class coches
     */
    public coches(String marca, String modelo , String color, int añoFabricacion, int potencia)
    {
        setDetails(marca,  modelo ,  color, añoFabricacion,  potencia);
        kilometros =0;
        indiceObjeto = 0;
    }
    
    
    private void setDetails(String marca, String modelo , String color, int añoFabricacion, int potencia){
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.añoFabricacion = añoFabricacion;
        this.potencia = potencia;
    }
    //metodo que devuelve todas las caracteristicas del objeto
    public String getDetails(){
        
        String adevolver = "marca: " + marca + " - " + "modelo: " + modelo + " - " +  "color: "+ color + " - " +  "añoFabricacion: " +  añoFabricacion + " - "+  "potencia: " + potencia + " - " + "kilometros: " + kilometros;
        
        return adevolver;
    }
    
    //metodo que permite fijar los kilometros del coche
    
    public void setkilometros(int kilometrosCoche){
        kilometros = kilometrosCoche;
    }
    //metodo que muestra los kilometros del coche
    
    public int getKilometros(){
        return kilometros;
        
    }
    
    //metodo que muestra la potencia del coche
    public int getPotencia(){
        return potencia;
    }
    
    //metodo que muestra la marca del coche
    public String getMArca(){
        return marca;
}

//metodo que muestra el año de fabricacion del coche
public  int getAñoFabricacion(){
    return añoFabricacion;
}


public int getIndice(){
    return indiceObjeto;
    

}

public int incrementIndice(){
    indiceObjeto++;
    
    return indiceObjeto;
}
   }