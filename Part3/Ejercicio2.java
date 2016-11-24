package Part3;
import utilidades.Teclado;

/**
 * Ejercicio2.java (UTF-8)
 *
 * 22-nov-2016
 * @author linuxct
 */

public class Ejercicio2 {
    public static void main(String[] args) {
        System.out.println("Introduzca un número");
        int numero = Teclado.readInt();
        if (numero%10==0){
            System.out.println("El número es múltiplo de 10");
        } else {
            System.out.println("El número no es múltiplo de 10");
        }
    }
}
