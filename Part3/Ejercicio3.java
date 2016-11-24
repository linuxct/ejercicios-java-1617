package Part3;
import utilidades.Teclado;

/**
 * Ejercicio3.java (UTF-8)
 *
 * 22-nov-2016
 * @author linuxct
 */

public class Ejercicio3 {
    public static void main(String[] args) {
        System.out.println("Introduzca un carácter");
        char caracter = Teclado.readChar();
        int casteada = (int) caracter; // convierto-casteo temporalmente el caracter a int para ver si es una letra mayuscula comparandolo con los datos de la tabla ascii #ClassicMIPSr2000
        if (casteada>=65 && casteada<=90){
            System.out.println("El carácter es una letra mayúscula");
        } else {
            System.out.println("El carácter no es una letra mayúscula");
        }
    }
}
