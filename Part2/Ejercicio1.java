package Part2;
import utilidades.Teclado;

/**
 * Ejercicio1.java (UTF-8)
 *
 * 22-nov-2016
 * @author linuxct
 */

public class Ejercicio1 {
    public static void main(String[] args) {
        System.out.println("Introduzca un entero");
        int numero1 = Teclado.readInt();
        System.out.println("Introduzca otro entero");
        int numero2 = Teclado.readInt();
        System.out.println("El primer entero introducido es " + numero1 + ", y el segundo entero es " + numero2);
    }
}
