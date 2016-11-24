package Part2;
import utilidades.Teclado;
import java.lang.Math;

/**
 * Ejercicio6.java (UTF-8)
 *
 * 22-nov-2016
 * @author linuxct
 */

public class Ejercicio6 {
    public static void main(String[] args) {
        System.out.println("Introduzca la velocidad en Km/h");
        double velocidadinicial = Teclado.readFloat();
        double metrosegundo=velocidadinicial/3.6;
        System.out.println("La velocidad en Km/h es " + velocidadinicial + ", y la velocidad en M/S es " + metrosegundo);
    }
}
