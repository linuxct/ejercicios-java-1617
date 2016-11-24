package Part2;
import utilidades.Teclado;

/**
 * Ejercicio3.java (UTF-8)
 *
 * 22-nov-2016
 * @author linuxct
 */

public class Ejercicio3 {
    public static void main (String[] args){
        System.out.println("Introduzca un número");
        int numero = Teclado.readInt();
        int numero_original = numero;
        // por dos == número + número_original. por tres = número (acumulado del por dos) + número_original...
        numero=numero+numero_original;
        System.out.println("El número introducido por 2 es " + numero);
        numero=numero+numero_original;
        System.out.println("El número introducido por 3 es " + numero);
    }
}
