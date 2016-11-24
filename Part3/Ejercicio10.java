package Part3;
import java.util.Arrays;
import utilidades.Teclado;

/**
 * Ejercicio10.java (UTF-8)
 *
 * 22-nov-2016
 * @author linuxct
 */

public class Ejercicio10 {
    public static void main(String[] args) {
        System.out.println("Introduzca un mes (2 dígitos)");
        int mes = Teclado.readInt();
        // creo que lo suyo seria hacerlo con un array ¿bidimensional?, para guardar los nombres de los meses, pero siempre quedará la implementación tosca de los if
        String[][] meses = {{null}, {"Enero","31"}, {"Febrero","28"}, {"Marzo","31"}, {"Abril","30"}, {"Mayo","31"}, {"Junio","30"}, {"Julio","31"}, {"Agosto","31"}, {"Septiembre","30"}, {"Octubre","31"}, {"Noviembre","30"}, {"Diciembre","31"}};
        if (mes>=1 && mes<=12){
            for (int i=0;i<meses.length;i++){
                if (i==mes){
                    System.out.println("El mes es " + Arrays.toString(meses[i]) + " días");
                }
            }
        } else {
            System.out.println("El mes introducido no es correcto, ¡abortando!");
            System.exit(0);
        }
    }
}
