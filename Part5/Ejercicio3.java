package Part5;
import utilidades.Teclado;

/**
 * Ejercicio3.java (UTF-8)
 *
 * 22-nov-2016
 * @author linuxct
 */

public class Ejercicio3 {
    public static void main(String[] args) {
        System.out.println("Introduzca el número del que desea conocer la tabla de multiplicar");
        int numero = Teclado.readInt();
        int numero_tmp = numero;
        System.out.println("Introduzca el número máximo de veces que se quiere mostrar");
        int multiplo = Teclado.readInt();
        System.out.println("\nTabla del " + numero + " hasta el " + multiplo);
        int res;
        for (int i=1; i<=multiplo; i++){
            res = i*numero_tmp;
            System.out.println(numero + "x" + i + "=" + res);
        }
    }
}
