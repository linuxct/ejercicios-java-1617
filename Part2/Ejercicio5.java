package Part2;
import java.lang.Math;
import utilidades.Teclado;

/**
 * Ejercicio5.java (UTF-8)
 *
 * 22-nov-2016
 * @author linuxct
 */

public class Ejercicio5 {
    public static void main(String[] args) {
        double PI = Math.PI;
        System.out.println("Introduzca el radio de la circunferencia");
        int radio = Teclado.readInt();
        double longitud = 2*PI*radio;
        double area = PI*(Math.pow(radio,2));
        System.out.println("La longitud de la circunferencia es " + longitud + ", y el area es " + area);
    }
}
