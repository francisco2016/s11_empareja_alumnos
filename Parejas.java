import java.util.ArrayList;
/**
 * Write a description of class Parejas here.
 *  proyecto que empareje a los alumnos de la clase de forma aleatoria y muestre dichas parejas por pantalla 
 *  asignándoles un número identificativo único de 4 cifras.
 */
public class Parejas
{
    // instance variables - replace the example below with your own
    private ArrayList<String> parejas;

    /**
     * Constructor for objects of class Parejas
     */
    public Parejas()
    {
       parejas = new ArrayList<>();
       parejas.add("Adeva  Tranche, Adrián");                   
       parejas.add("Aller González, Francisco Javier");
       parejas.add("lvarez Prieto, Noelia");                   
       parejas.add("Barrionuevo Pérez, Manuel");         
       parejas.add("Menéndez Pouso, Francisco José");           
       parejas.add("Bóveda del Río, José Antonio");          
       parejas.add("Pérez Bayón, Álvaro");                     
       parejas.add("de la Viuda Crespo, Ignacio");          
       parejas.add("Pradera San José, Daniel");                
       parejas.add("Encina Maestro, David");        
       parejas.add("Prieto Mediavilla, Gabriel");              
       parejas.add("Felix Nañez, Kevin");         
       parejas.add("Robles González, Miguel Ángel");           
       parejas.add("Fernández Diez, Daniel");        
       parejas.add("Sánchez Manzano, Adán");                    
       parejas.add("Fernández González, Javier");         
       parejas.add("Serrano García, Verónica");                
       parejas.add("Fernández Rincón, Jesús");         
       parejas.add("Tascón González, Anibal");                 
       parejas.add("Fuentes Álvarez, Francisco José");         
       parejas.add("García Juárez, David");                     
       parejas.add("López Beltrán, Víctor");
       parejas.add("García Serrano, Rubén");                    
       parejas.add("Lora García, Sandra");
       parejas.add("González Álvarez, David");                  
       parejas.add("Melcón Diez, Víctor");          
    }

    /**
     * mt para mostrar por pantalla el nombre de todos los alumnos.
     */
    public void mostrarAlunmos()
    {
        int cont = 0;
        while(cont < parejas.size()){
            System.out.println( (cont +1)+ " Nombre del alumno/a:" +parejas.get(cont));
            cont ++;
        }
        System.out.println();
    }
    
    /**
     * muestra por pantalla el alumno con el índice pasado por parámetro.
     */
    public void indice(int index){
        if(index >= 1 && index < (parejas.size() + 1)){
        System.out.println("Nombre del alumno/a nº "  +index+ "  --" +parejas.get(index-1));
        System.out.println();
    }
    else{
        System.out.println("Error, el nº " +index+ " no es válido, ha de estar entre 1 y " +parejas.size() + ".");
    }
    }
}












