package Part6_arrays;
import java.util.Arrays;

/**
 * Ejercicio4.java (UTF-8)
 *
 * 24-nov-2016
 * @author linuxct
 */

public class Ejercicio4 {
    public static void main(String[] args) {
        int []a = new int [20];
        int contador=0;
        for (int i=0;i<40;i++){ //i está haciendo de falso contador aquí, lo que en verdad hace es pasar número a número los que sean (en este caso) pares.
            if (i%2==0){
                a[contador]=i;
                contador++;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
