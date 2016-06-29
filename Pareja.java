import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
/**
 * crea un nuevo proyecto que empareje a los alumnos de la clase de forma aleatoria y muestre dichas parejas por pantalla 
 * asignándoles un número identificativo único de 4 cifras. El programa debe contemplar que el número de alumnos pueda ser
 * impar, en cuyo caso habrá una pareja de 3 miembros. Se da por supuesto que, como mínimo, habrá al menos 2 alumnos en clase.
 */
public class Pareja
{
    //creamos una colección de alumnos que vamos a emparejar.
    private ArrayList<String> parejas;

    /**
     * Constructor for objects of class Pareja
     */
    public Pareja()
    {
        parejas = new ArrayList<>();
        parejas.add("Adeva Tranche, Adrián");
        parejas.add("Aller González, Francisco Javier");
        parejas.add("Álvarez Prieto, Noelia");
        parejas.add("Bóveda del Río, José Antonio");
        parejas.add("Bóveda del Río, José Antonio");
        parejas.add("de la Viuda Crespo, Ignacio");
        parejas.add("Encina Maestro, David”");
        parejas.add("Felix Nañez, Kevin");
        parejas.add("Fernández Diez, Daniel");
        parejas.add("Fernández Diez, Daniel");
        parejas.add("Fernández González, Javier");
        parejas.add("Fernández Rincón, Jesús");
        parejas.add("Fuentes Álvarez, Francisco José");
        parejas.add("García Juárez, David");
        parejas.add("García Serrano, Rubén");
        parejas.add("González Álvarez, David");
        parejas.add("López Beltrán, Víctor");
        parejas.add("Lora García, Sandra");               parejas.add("Prieto Mediavilla, Gabriel");
        parejas.add("Melcón Diez, Víctor");               parejas.add("Robles González, Miguel Ángel");
        parejas.add("Menéndez Pouso, Francisco José");    parejas.add("Sánchez Manzano, Adán");
        parejas.add("Pérez Bayón, Álvaro");               parejas.add("Serrano García, Verónica");
        parejas.add("Pradera San José, Daniel");          parejas.add("Tascón González, Anibal");

    }

    /**
     * para facilitar un número identificativo único de 4 cifras
     */
    public String idAlumno(int numero){
        String id = "";
        if(numero < 1000){
                    id = "0" +numero+ "" ;
                }
        if(numero < 100){
                id = "00" +numero+ "" ;
            }
        if(numero < 10){
            id = "000" +numero+ "" ;
        }
        
        
        return id;
    }

    /**
     * hacemos una copia de la colección parejas para facilitar el emparejamiento.
     */
    public void muestraParejas(){
        ArrayList<String> copia = new ArrayList<>();
        copia = (ArrayList)parejas.clone();//
        Collections.shuffle(copia); // agitamos los elementos de la colección para que queden sesordenados.
        Iterator<String> it = copia.iterator();

        String nombre = "";
        int index = 0;
        int idPareja = 1;
        while(it.hasNext()){
            nombre = it.next();
            it.remove();

            if(index == 0){
                System.out.println(" ");
                System.out.println("Nombres de la pareja: " +idAlumno(idPareja));
                idPareja ++;
            }
            System.out.println(nombre);
            index ++;
            if(index == 2 && copia.size() > 1){
                index = 0;
            }
        }

    }

}