package Part6_arrays;
import utilidades.Teclado;

/**
 * Ejercicio6.java (UTF-8)
 *
 * 24-nov-2016
 * @author linuxct
 */

public class Ejercicio6 {
    public static void main(String[] args) {
        int []a = new int [10];
        boolean retry=false;
        for (int i=0;i<10;i++){ //array de escritura
            if (retry){
                i--;
                retry=false;
            }
            System.out.println("Introduzca un entero para el índice "+i);
            a[i]=Teclado.readInt();
            if (a[i]==2147483647){ //es el valor devuelto al haber una excepcion en la clase Teclado.readInt()
                retry=true; //reducirá el contador en la siguiente iteración
            }
        }
        double sumatoriopos=0,sumatorioneg=0,contadorpos=0,contadorneg=0;
        for (int i=0;i<10;i++){ //array de lectura
            if (a[i]>=0) { //convenio el cero es positivo
                sumatoriopos += a[i];
                contadorpos++;
            } else {
                sumatorioneg += a[i];
                contadorneg++;
            }
        }
        //System.out.println(contadorpos + " " + contadorneg);
        double mediapos = sumatoriopos/contadorpos;
        double medianeg = sumatorioneg/contadorneg;
        System.out.println("La media de positivos da " + mediapos + ", y la media de negativos da " + medianeg + ".");
    }
}
