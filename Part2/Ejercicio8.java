package Part2;
import utilidades.Teclado;

/**
 * Ejercicio8.java (UTF-8)
 *
 * 22-nov-2016
 * @author linuxct
 */

public class Ejercicio8 {
    public static void main(String[] args) {
        System.out.println("Introduzca el radio de la esfera");
        int radio = Teclado.readInt();
        double volumen = (4*Math.PI*Math.pow(radio,3))/3;
        System.out.println("El resultado del volumen es " + volumen);
    }
}
