package Part5;
import utilidades.Teclado;

/**
 * Ejercicio4.java (UTF-8)
 *
 * 22-nov-2016
 * @author linuxct
 */

public class Ejercicio4 {
    public static void main(String[] args) {
        int contador=0,numero,longitud,last_num;
        while (true) {
            System.out.println("\nIntroduzca un número");
            numero = Teclado.readInt();
            /* longitud = (int)(Math.log10(numero)+1);
            do {
                numero = numero/10;
                longitud--;
                System.out.println(longitud + "  " + numero);
            } while (longitud>1); //chapuza mal hecha que te saca el PRIMER dígito del número, no el último
            */
            last_num = numero%10; //este sí que saca el último dígito
            if (last_num==2){
                contador++;
                System.out.println("El contador ha aumentado. El valor actual es " + contador);
            }
        }
    }
}
