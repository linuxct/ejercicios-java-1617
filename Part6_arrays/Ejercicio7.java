package Part6_arrays;
import utilidades.Teclado;

/**
 * Ejercicio7.java (UTF-8)
 *
 * 24-nov-2016
 * @author linuxct
 */

public class Ejercicio7 {
    public static void main(String[] args) {
        int alturas;
        boolean repetir;
        do { 
            System.out.println("Introduzca el número de datos a añadir"); //todo implementar detección de números introducidos automáticamente (cuando el usuario no inserte nada, hacer break)
            alturas = Teclado.readInt();
            repetir = alturas==2147483647;
        } while (repetir);
        double []a = new double [alturas];
        boolean retry=false;
        for (int i=0;i<alturas;i++){
            if (retry){
                i--;
                retry=false;
            }
            System.out.println("Introduzca la altura del dato con índice " + i);
            a[i]=Teclado.readDouble();
            if (a[i]==1.7976931348623157E308){ //es el valor devuelto al haber una excepcion en la clase Teclado.readDouble()
                retry=true; //reducirá el contador en la siguiente iteración
            }
        }
        double sumatorio=0;
        for (int i=0;i<alturas;i++){
            sumatorio += a[i];
        }
        double media = sumatorio/alturas;
        System.out.println("La media da " + media);
        for (int i=0;i<alturas;i++){
            if (a[i]>media){
                System.out.println("La altura con índice " + i + " tiene una altura superior (" + a[i] + ") a la media (" + media + ")");
            } else if (a[i]==media) {
                System.out.println("La altura con índice " + i + " tiene una altura igual (" + a[i] + ") a la media (" + media + ")");
            } else {
                System.out.println("La altura con índice " + i + " tiene una altura inferior (" + a[i] + ") a la media (" + media + ")");
            }
        } 
    }
}
