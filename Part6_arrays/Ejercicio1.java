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
        if (numeros>=2147483646){ //tamaño máximo de un interger, para que no haya overflow.
            System.out.println("Error");
            repite=true;
        }
            if (!repite){
            int []a = new int [numeros];
            int index;
            for (int i=0;i<numeros;i++){
                index=i+1;
                System.out.println("Introduzca la nota para el índice " + index);
                a[i]=Teclado.readInt();
                if (a[i]<0 || a[i]>10){
                    System.out.println("Error");
                    i--;
                }
            }
            double sumatorio=0,notaminima=10,notamaxima=0;
            int posmin=0,posmax=0;
            for (int i=0;i<numeros;i++){
                index=i+1;
                System.out.println("La nota " + index + " vale " + a[i]);
                sumatorio += a[i];
                if (a[i]>notamaxima){
                    notamaxima=a[i];
                    posmax=i+1;
                }
                if (a[i]<notaminima){
                    notaminima=a[i];
                    posmin=i+1;
                }
            }
            double resultado = sumatorio/numeros;
            System.out.println("La media da " + resultado);
            System.out.println("La nota máxima es " + notamaxima + " y pertenece al alumno " + posmax);
            System.out.println("La nota mínima es " + notaminima + " y pertenece al alumno " + posmin);
        }
        } while (repite);
    }
}