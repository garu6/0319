import java.util.ArrayList;
import java.util.Iterator;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class concesionario
{
    private ArrayList<coche> concesionario;
    private coche meterCoche;
    private int id;
    /**
     * Constructor for objects of class concesionario
     */
    public concesionario()
    {
        concesionario = new ArrayList<coche>();
        id=1;
    }
    
    
    public concesionario (String txt){
        
        concesionario = new ArrayList<coche>();
        id=1;
        
        fileParser(txt);
    }

    public void añadirCoche(String marca, String modelo , String color, Integer fechaFabricacion, Integer potencia)
{
    coche meterCoche = new coche (marca,  modelo ,  color,  fechaFabricacion,  potencia);
    concesionario.add(meterCoche);
    id++;
}

public void listarCoches(){
   int indice =1;
   for (coche elemento : concesionario){
       
       System.out.println(indice + " " + elemento.getDetails());
       indice++;
    }
}


/**
     * Muestra un listado ordenado de los coches  del concesionario en función
     * de su año (de mayor a menor).
     */
   

public void ordenarPoraño(){
    ArrayList <coche> coleccion = new ArrayList<>();
    coleccion.addAll(concesionario);
    if (coleccion.size() > 0){
        coche cocheMasFecha = coleccion.get(0);
        int cont =0;
        int posicionMasFecha =0;
        while (cont < coleccion.size()){
            if (coleccion.get(cont).getfechaFabricacion() <1){
                coleccion.remove(cont);
                cont--;
            }else if (coleccion.get(cont).getfechaFabricacion() >= cocheMasFecha.getfechaFabricacion()){
                cocheMasFecha = coleccion.get(cont);
                posicionMasFecha = cont;
                
            }
            cont++;
            
        }
        System.out.println(coleccion.get(posicionMasFecha).getDetails());
        coleccion.remove(posicionMasFecha);
    }else{
        System.out.println("No tienes objetos para ordenar");
        
        
    }
    
    
   
}

public void ordenarPorpotencia(){
  ArrayList<coche> coleccion = new ArrayList<>();
        coleccion.addAll(concesionario);
        if (coleccion.size() > 0){
            while(coleccion.size() > 0){
                coche masxPotencia = coleccion.get(0);
                int x = 0;  
                int posicionMasPotencia = 0;
                while(x < coleccion.size()){                    
                    if(coleccion.get(x).getPotencia() < 1){   
                        coleccion.remove(x);
                    }
                    else if(coleccion.get(x).getPotencia() >=masxPotencia.getPotencia()){    
                        
                            masxPotencia = coleccion.get(x);
                            posicionMasPotencia = x;
                        }
                        x++;
                    
                }
                if(!coleccion.isEmpty()){
                    System.out.println(coleccion.get(posicionMasPotencia).getDetails());
                    coleccion.remove(posicionMasPotencia);
                }
                else{
                    System.out.println("No tienes objetos a ordenar");                
                }
            }
        }
        else{
            System.out.println("Error: el almacén está vacío.");
        }
    
    
}

public void modificarPotencia(int coche ,  int nuevaPotencia){
            concesionario.get(coche-1).setPotencia(nuevaPotencia);

    }
    
    
    
    public void eliminarPorMarca(String marca){
        Iterator<coche> it = concesionario.iterator();
        while(it.hasNext()){
            coche CocheActual = it.next();
            if(CocheActual.getMarca().toLowerCase().contains(marca.toLowerCase())){
                it.remove();
            }
        }
        
        
    }
    
    
    
    /*
     * metodo que crea los objetos a partir de un archivo txt guardado en la carpeta del proyecto
     */
    public void fileParser(String txt)
    {
        try {
            File archivo = new File(txt);
            Scanner sc = new Scanner(archivo);
            while (sc.hasNextLine()) {
                String[] arrayDatosCoches = sc.nextLine().split(" # ");
                añadirCoche(arrayDatosCoches[0], arrayDatosCoches[1],arrayDatosCoches[2],Integer.parseInt(arrayDatosCoches[3]), Integer.parseInt(arrayDatosCoches[4]));
            }
            sc.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
    
}


