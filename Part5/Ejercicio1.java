package Part5;
import utilidades.Teclado;

/**
 * Ejercicio1.java (UTF-8)
 *
 * 22-nov-2016
 * @author linuxct
 */

public class Ejercicio1 {
    public static void main(String[] args) {
        System.out.println("Introduzca un entero positivo de n cifras");
        int numero = Teclado.readInt();
        int longitud = (int)(Math.log10(numero)+1);
        System.out.println("El número de cifras de el número introducido es " + longitud);
    }
}
