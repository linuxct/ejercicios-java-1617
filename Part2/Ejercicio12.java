package Part2;
import utilidades.Teclado;

/**
 * Ejercicio12.java (UTF-8)
 *
 * 22-nov-2016
 * @author linuxct
 */

public class Ejercicio12 {
    public static void main(String[] args) {
        System.out.println("Introduzca un numero de 5 cifras");
        // HACERLO CON UN WHILE NUMERO > 10
        int numero = Teclado.readInt();
        if (numero > 9999 && numero < 99999) { //no había implementación más tosca que esta, qué va 
            int quinto = numero%10;
            numero = numero/10;
            int cuarto = numero%10;
            numero = numero/10;
            int tercero = numero%10;
            numero = numero/10;
            int segundo = numero%10;
            numero = numero/10;
            int primero = numero%10;
            System.out.println("El número separado, y al revés, es " + quinto + " " + cuarto + " " + tercero + " " + segundo + " " + primero);
        } else {
            System.out.println("No es un número de cinco cifras");
        }
    }
}
