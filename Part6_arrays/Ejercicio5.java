package Part6_arrays;
import utilidades.Teclado;

/**
 * Ejercicio5.java (UTF-8)
 *
 * 24-nov-2016
 * @author linuxct
 */

public class Ejercicio5 {
    public static void main(String[] args) {
        int []a = new int [10];
        for (int i=0;i<10;i++){ //array de escritura
            System.out.println("Introduzca el número para el índice " + i);
            a[i]=Teclado.readInt();
        }
        int contadorpos=0,contadorneg=0,contadorceros=0;
        for (int i=0;i<10;i++){ //array de lectura
            if (a[i]>0){
                contadorpos++;
            } else if (a[i]<0) {
                contadorneg++;
            } else {
                contadorceros++;
            }
        }
        System.out.println("En este array hay " + contadorpos + " números positivos, " + contadorneg + " números negativos, y " + contadorceros + " ceros.");
    }
}
