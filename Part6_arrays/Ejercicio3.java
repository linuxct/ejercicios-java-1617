package Part6_arrays;
import utilidades.Teclado;

/**
 * Ejercicio3.java (UTF-8)
 *
 * 24-nov-2016
 * @author linuxct
 */

public class Ejercicio3 {
    public static void main(String[] args) {
        System.out.println("Introduzca el número de alumnos"); //todo implementar detección de números introducidos automáticamente (cuando el usuario no inserte nada, hacer break)
        int alumnos = Teclado.readInt();
        double []a = new double [alumnos];
        for (int i=0;i<alumnos;i++){
            System.out.println("Introduzca la nota del alumno con índice " + i);
            a[i]=Teclado.readDouble();
        }
        double sumatorio=0;
        for (int i=0;i<alumnos;i++){
            sumatorio += a[i];
        }
        double media = sumatorio/alumnos;
        System.out.println("La media da " + media);
        for (int i=0;i<alumnos;i++){
            if (a[i]>=media){
                System.out.println("El alumno con índice " + i + " tiene una nota superior (" + a[i] + ") a la media (" + media + ")");
            }
        } 
    }
}