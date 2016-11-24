package Part3;
import utilidades.Teclado;

/**
 * Ejercicio4.java (UTF-8)
 *
 * 22-nov-2016
 * @author linuxct
 */

public class Ejercicio4 {
    public static void main(String[] args) {
        //esto desespera ya
        System.out.println("Introduzca un carácter");
        char caracter1 = Teclado.readChar();
        System.out.println("Introduzca otro carácter");
        char caracter2 = Teclado.readChar();
        if (caracter1==caracter2){
            System.out.println("Los carácteres son iguales");
        } else {
            System.out.println("Los carácteres no son iguales");
        }
    }
}
