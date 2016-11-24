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
        System.out.println("Introduzca el número de datos a añadir"); //todo implementar detección de números introducidos automáticamente (cuando el usuario no inserte nada, hacer break)
        int alturas = Teclado.readInt();
        double []a = new double [alturas];
        for (int i=0;i<alturas;i++){
            System.out.println("Introduzca la altura del dato con índice " + i);
            a[i]=Teclado.readDouble();
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
