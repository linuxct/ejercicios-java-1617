package Part2;
import utilidades.Teclado;
import java.lang.Math;

/**
 * Ejercicio7.java (UTF-8)
 *
 * 22-nov-2016
 * @author linuxct
 */

public class Ejercicio7 {
    public static void main(String[] args) {
        System.out.println("Introduzca la longitud del primer cateto");
        int cat1 = Teclado.readInt();
        System.out.println("Introduzca la longitud del segundo cateto");
        int cat2 = Teclado.readInt();
        double hipotenusa = Math.sqrt(Math.pow(cat1,2) + Math.pow(cat2,2));
        System.out.println("A² = B² + C² ~ La hipotenusa mide " + hipotenusa);
    }
}
