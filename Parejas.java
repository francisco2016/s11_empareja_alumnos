import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
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
     * mt para añadir un nuevo alumno a la colección.
     */
    public void setAlumno(String alumno){
        parejas.add(alumno);
    }

    /**
     * mt para eliminar un nuevo alumno a la colección.
     */
    public void eliminar(String alumno){
        parejas.remove(alumno);
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
    
    /**
     * mt para conseguir un número identificativo único de 4 cifras
     */
    public String setNumId(int id){
        String sol = "";
        if(id > 0 && id < 1000){
            if(id < 1000 ){
                sol = "0" +id;
            }
            if(id < 100){
               sol = "00" +id;
            }
            if(id < 10){
                sol = "000" +id;
            }
        }
        else{
            System.out.println("Error, el id ha de estar entre 0 y 1000");
        }
        return sol;
    }
    
    /**
     * mt para mostrar por pantalla el nombre de todos las parejas.
     * Se pide en esta actividad que crees un nuevo proyecto que empareje a los alumnos de la clase de forma aleatoria
     * y muestre dichas parejas por pantalla asignándoles un número identificativo único de 4 cifras
     */
    public void mostrarParejas(){
        //1º Hacemos una copia de la colección de alumno.
        ArrayList<String> copia = new ArrayList<>(); //VL de Objetos String de tipo ArrayList.
        copia = (ArrayList)parejas.clone();//hemos clonado la colección de alumnos en la VL copia.
        Collections.shuffle(copia);// el mt shuffle(...) desordena la colección aleatoriamente.
        Iterator<String> it = copia.iterator();//creamos un objeto iterator. en la VL "it".
        
        String nombre = ""; //VL para almacenar el nombre de cada alumno.
        int cont = 0;
        int cont2 = 1;
        
        while(it.hasNext()){//mientras haya elementos en la VL it, sin recorrer....
            nombre = it.next();//cada uno de ellos se almacenará en la VL nombre.
            it.remove();
            
            if(cont == 0){
                System.out.println();
                System.out.println("Pareja " +setNumId(cont2)+ " formada por: ");
                 cont2++;
            }
            System.out.println(nombre);
            cont ++;
            if(cont == 2 && copia.size() > 1){
                cont = 0;
            }
        }
        System.out.println();
        
    }
}





















