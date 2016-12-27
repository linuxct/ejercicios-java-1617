package Part6_arrays;
import utilidades.Teclado;

/**
 * Ejercicio2.java (UTF-8)
 *
 * 24-nov-2016
 * @author linuxct
 */

public class Ejercicio2 {
    public static void main(String[] args) {
        int []a = new int [10];
        boolean retry=false;
        for (int i=0;i<10;i++){
            if (retry){
                i--;
                retry=false;
            }
            System.out.println("Introduzca el número para el índice " +i);
            a[i]=Teclado.readInt(); //índices del 0 al 9
            if (a[i]==2147483647){ //es el valor devuelto al haber una excepcion en la clase Teclado.readInt()
                retry=true; //reducirá el contador en la siguiente iteración
            }
        }
        double sumatorio=0;
        for (int i=0;i<10;i++){
            if (i%2==0){
                sumatorio += a[i];
            }
        }
        double resultado = sumatorio/5; //5 porque va a sumar sólo las posiciones 0, 2, 4, 6 y 8
        System.out.println("La media de los números en posiciones pares da " + resultado);
    }
}
