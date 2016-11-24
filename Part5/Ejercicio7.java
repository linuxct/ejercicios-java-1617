package Part5;
import utilidades.Teclado;

/**
 * Ejercicio7.java (UTF-8)
 *
 * 23-nov-2016
 * @author linuxct
 */

public class Ejercicio7 {
    public static void main(String[] args) {
        System.out.println("Introduzca el binario a convertir");
        String numero = Teclado.readString();
        System.out.println("El número en decimal es " + Integer.parseInt(numero, 2));
    }
}
