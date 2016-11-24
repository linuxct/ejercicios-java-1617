package Part5;
import utilidades.Teclado;

/**
 * Ejercicio6.java (UTF-8)
 *
 * 23-nov-2016
 * @author linuxct
 */

public class Ejercicio6 {
    public static void main(String[] args) {
        System.out.println("Introduzca el número a convertir");
        int numero = Teclado.readInt();
        System.out.println("El número en binario es " + Integer.toBinaryString(numero));
    }
}
