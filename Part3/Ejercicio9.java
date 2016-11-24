package Part3;
import utilidades.Teclado;

/**
 * Ejercicio9.java (UTF-8)
 *
 * 22-nov-2016
 * @author linuxct
 */

public class Ejercicio9 {
    public static void main(String[] args) {
        System.out.println("Introduzca una hora (2 dígitos)");
        int h = Teclado.readInt();
        System.out.println("Introduzca unos minutos (2 dígitos)");
        int m = Teclado.readInt();
        System.out.println("Introduzca unos segundos (2 dígitos)");
        int s = Teclado.readInt();
        if (h>0 && h<=24 && m>=0 && m<=59 && s>=0 && s<=59){
            System.out.println("La hora introducida es válida - " + h + ":" + m + ":" + s);
        } else {
            System.out.println("La hora introducida no es válida");
        }
    }
}
