package Part2;
import utilidades.Teclado;

/**
 * Ejercicio10.java (UTF-8)
 *
 * 22-nov-2016
 * @author linuxct
 */

public class Ejercicio10 {
    public static void main(String[] args) {
        System.out.println("Introduzca un numero de tres cifras");
        int numero = Teclado.readInt();
        int tercero = numero%10;
        numero = numero/10;
        int segundo = numero%10;
        numero = numero/10;
        int primero = numero%10;
        System.out.println("El número separado es " + primero + " " + segundo + " " + tercero);
    }
}
