package Part5;
import utilidades.Teclado;

/**
 * Ejercicio10.java (UTF-8)
 *
 * 23-nov-2016
 * @author linuxct
 */

public class Ejercicio10 {
    public static void main(String[] args) {
        System.out.println("Introduzca una frase");
        String frase = Teclado.readString();
        frase = frase.replaceAll(" \\S*$", ""); //frase.replaceAll localiza el último espacio de la frase y marca que lo que sea que haya después debe ser borrado hasta que la línea finalice con una expresión regular, y eso lo reemplaza con absolutamente nada, o sea que lo borra. 
        System.out.println("\nLa frase sin la última palabra es \n" + frase); 
    }
}
