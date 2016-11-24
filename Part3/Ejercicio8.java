package Part3;
import utilidades.Teclado;

/**
 * Ejercicio8.java (UTF-8)
 *
 * 22-nov-2016
 * @author linuxct
 */

public class Ejercicio8 {
    public static void main(String[] args) {
        System.out.println("Introduzca el primer número");
        int numero1 = Teclado.readInt();
        System.out.println("Introduzca el segundo número");
        int numero2 = Teclado.readInt();
        System.out.println("Introduzca el tercer número");
        int numero3 = Teclado.readInt();
        if (numero1 == numero2 && numero1 == numero3){
            System.out.println("Los tres números no deberían ser iguales, ¡abortando!");
            System.exit(0);
        }
        if (numero1>numero2 && numero1>numero3){
            System.out.println("El primer número es el mayor");
        } else if (numero2>numero1 && numero2>numero3){
            System.out.println("El segundo número es el mayor");
        } else {
            System.out.println("El tercer número es el mayor");
        }
    }
}
