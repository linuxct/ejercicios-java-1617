package Part2;
import utilidades.Teclado;

/**
 * Ejercicio2.java (UTF-8)
 *
 * 22-nov-2016
 * @author linuxct
 */

public class Ejercicio2 {
    public static void main(String[] args) {
        System.out.println("Introduzca su nombre");
        String string = Teclado.readString(); 
        System.out.println("Buenos días " + string);
    }
}
