package Part3;
import utilidades.Teclado;

/**
 * Ejercicio6.java (UTF-8)
 *
 * 22-nov-2016
 * @author linuxct
 */

public class Ejercicio6 {
    public static void main(String[] args) {
        System.out.println("Introduzca un carácter");
        char caracter = Teclado.readChar();
        int cast = (int) caracter; // convierto-casteo temporalmente el caracter a int para ver si es una letra mayuscula comparandolo con los datos de la tabla ascii #ClassicMIPSr2000
        if (cast>=48 && cast<=57){
            System.out.println("El carácter introducido es un número entre el 0 y el 9");
        } else {
            System.out.println("El carácter introducido no es un número entre el 0 y el 9");
        }
    }
}
