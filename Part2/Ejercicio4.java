package Part2;
import utilidades.Teclado;

/**
 * Ejercicio4.java (UTF-8)
 *
 * 22-nov-2016
 * @author linuxct
 */

public class Ejercicio4 {
    public static void main(String[] args) {
        System.out.println("Datos METAR: Introduzca la temperatura en grados centígrados");
        int celsius = Teclado.readInt();
        int fahrenheit = 32+(9*celsius/5);
        System.out.println("Datos METAR: La temperatura en grados centígrados es " + celsius + ", y en grados fahrenheit es " + fahrenheit);
    }
}
