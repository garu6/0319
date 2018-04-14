import java.util.ArrayList;
/**
 * Write a description of class concesionario here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class concesionario
{
    private ArrayList<coches> concesionario;
    private coches coche;
    
    /**
     * Constructor for objects of class concesionario
     */
    public concesionario()
    {
        concesionario = new ArrayList<coches>();
        
    }


    public void añadirCoche(String marca, String modelo , String color, int añoFabricacion, int potencia)
{
    concesionario.add(new coches(marca,modelo,color,añoFabricacion,potencia));
}

public void listarCoches(){
   int indice = 0;
   
   for (coches elemento : concesionario){
       
       System.out.println(indice + "  " +  elemento.getDetails());
       indice++;
    }
}
}