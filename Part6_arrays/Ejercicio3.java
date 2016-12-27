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
        boolean repetir,retry=false;
        int alumnos;
        do {
            System.out.println("Introduzca el número de alumnos");
            alumnos = Teclado.readInt();
            repetir = alumnos==2147483647;
        } while (repetir);  //todo implementar detección de números introducidos automáticamente (cuando el usuario no inserte nada salir)
        double []a = new double [alumnos];
        int index=0;
        for (int i=0;i<alumnos;i++){
            if (retry){
                i--;
                retry=false;
            }
            index=i+1;
            System.out.println("Introduzca la nota del alumno con índice " + index);
            a[i]=Teclado.readDouble();
            if (a[i]==1.7976931348623157E308){ //es el valor devuelto al haber una excepcion en la clase Teclado.readDouble()
                retry=true; //reducirá el contador en la siguiente iteración
            }
        }
        double sumatorio=0;
        for (int i=0;i<alumnos;i++){
            sumatorio += a[i];
        }
        double media = sumatorio/alumnos;
        System.out.println("La media da " + media);
        for (int i=0;i<alumnos;i++){
            if (a[i]>=media){
                index=i+1;
                System.out.println("El alumno con índice " + index + " tiene una nota superior (" + a[i] + ") a la media (" + media + ")");
            }
        } 
    }
}