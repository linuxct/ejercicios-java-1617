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
        int index=0;
        boolean retry=false;
        for (int i=0;i<10;i++){ //array de escritura
            if (retry){
                i--;
                retry=false;
            }
            index=i+1;
            System.out.println("Introduzca el número para el índice " + index);
            a[i]=Teclado.readInt();
            if (a[i]==2147483647){ //es el valor devuelto al haber una excepcion en la clase Teclado.readInt()
                retry=true; //reducirá el contador en la siguiente iteración
            }
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
        System.out.println("En este array hay " + contadorpos + " número(s) positivo(s), " + contadorneg + " número(s) negativo(s), y " + contadorceros + " cero(s).");
    }
}
