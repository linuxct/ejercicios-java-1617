package Part6_arrays;
import utilidades.Teclado;

/**
 * Ejercicio1.java (UTF-8)
 *
 * 23-nov-2016
 * @author linuxct
 */

public class Ejercicio1 {
    public static void main(String[] args) {
        System.out.println("Introduzca la cantidad de números a introducir"); //todo implementar detección de números introducidos automáticamente (cuando el usuario no inserte nada, hacer break)
        int numeros = Teclado.readInt();
        int []a = new int [numeros];
        for (int i=0;i<numeros;i++){
            System.out.println("Introduzca el número");
            a[i]=Teclado.readInt();
        }
        double sumatorio=0;
        for (int i=0;i<numeros;i++){
            sumatorio += a[i];
        }
        double resultado = sumatorio/numeros;
        System.out.println("La media da " + resultado);
    }
}