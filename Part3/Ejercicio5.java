package Part3;
import utilidades.Teclado;

/**
 * Ejercicio5.java (UTF-8)
 *
 * 22-nov-2016
 * @author linuxct
 */

public class Ejercicio5 {
    public static void main(String[] args) {
        System.out.println("Introduzca un carácter");
        char caracter1 = Teclado.readChar();
        System.out.println("Introduzca otro carácter");
        char caracter2 = Teclado.readChar();
        int cast1 = (int) caracter1; // convierto-casteo temporalmente el caracter a int para ver si es una letra mayuscula comparandolo con los datos de la tabla ascii #ClassicMIPSr2000
        if (cast1>=97 && cast1<=122){
            System.out.println("El primer carácter es una letra minúscula");
        } else {
            System.out.println("El primer carácter no es una letra mayúscula");
        }
        int cast2 = (int) caracter2; // convierto-casteo temporalmente el caracter a int para ver si es una letra mayuscula comparandolo con los datos de la tabla ascii #ClassicMIPSr2000
        if (cast2>=97 && cast1<=122){
            System.out.println("El segundo carácter es una letra minúscula");
        } else {
            System.out.println("El segundo carácter no es una letra mayúscula");
        }
    }
}
