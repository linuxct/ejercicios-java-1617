package Part3;
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
        int numero = Teclado.readInt();
        if (numero%2==0){
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }
    }
}
