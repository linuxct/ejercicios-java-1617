package Part6_arrays;
import utilidades.Teclado;
import java.util.Arrays;

/**
 * Ejercicio9.java (UTF-8)
 *
 * 24-nov-2016
 * @author linuxct
 */

public class Ejercicio9 {
    public static void main(String[] args) {
        System.out.println("Introduzca el tamaño del array");
        int n = Teclado.readInt();
        double []a = new double [n];
        for (int i=0;i<a.length;i++){
            a[i]=Math.random(); //ya está, ¿no?
        }
        System.out.println("Este array contiene los siguientes números aleatorios \n" + Arrays.toString(a));
    }
}
