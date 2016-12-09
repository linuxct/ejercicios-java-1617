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
        boolean repite;
        do { 
        repite=false;
        System.out.println("Introduzca la cantidad de números a introducir"); //todo implementar detección de números introducidos automáticamente (cuando el usuario no inserte nada, hacer break)
        int numeros = Teclado.readInt();
        if (numeros>=2147483646){
            System.out.println("Error");
            repite=true;
        }
            if (repite==false){
            int []a = new int [numeros];
            for (int i=0;i<numeros;i++){
                System.out.println("Introduzca la nota");
                a[i]=Teclado.readInt();
                if (a[i]<0 || a[i]>9){
                    System.out.println("Error");
                    i--;
                }
            }
            double sumatorio=0;
            for (int i=0;i<numeros;i++){
                sumatorio += a[i];
            }
            double resultado = sumatorio/numeros;
            System.out.println("La media da " + resultado);
        }
        } while (repite);
    }
}