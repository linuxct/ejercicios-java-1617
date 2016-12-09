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
//        System.out.println("Introduzca un mes (2 dígitos)");
//        int mes = Teclado.readInt();
//        // creo que lo suyo seria hacerlo con un array ¿bidimensional?, para guardar los nombres de los meses, pero siempre quedará la implementación tosca de los if
//        String[][] meses = {{null}, {"Enero","31"}, {"Febrero","28"}, {"Marzo","31"}, {"Abril","30"}, {"Mayo","31"}, {"Junio","30"}, {"Julio","31"}, {"Agosto","31"}, {"Septiembre","30"}, {"Octubre","31"}, {"Noviembre","30"}, {"Diciembre","31"}};
//        if (mes>=1 && mes<=12){
//            for (int i=0;i<meses.length;i++){
//                if (i==mes){
//                    System.out.println("El mes es " + Arrays.toString(meses[i]) + " días");
//                }
//            }
//        } else {
//            System.out.println("El mes introducido no es correcto, ¡abortando!");
//            System.exit(0);
//        }
        String fecha;
        String[] a;
        int[] b = new int [3];
        int[] c = {0,31,29,31,30,31,30,31,31,30,31,30,31};
        boolean bisiesto = false;
        boolean ojo = false;
        System.out.println("Introduzca una fecha en el formato dd/mm/YYYY");
        fecha = Teclado.readString();
        int contador=0;
        char[] charArray = fecha.toCharArray();
        for (int i=0;i<charArray.length;i++){
            if (i=='/'){
                contador++;
            }
        }
        if (contador!=2){
            System.exit(0);
        }
        a = fecha.split("/");
        for (int i=0; i<a.length;i++){
            b[i]=Integer.parseInt(a[i]);
        }
        if (b[2]%4==0 && b[2]%100!=0){
            bisiesto = true;
        }
        ojo = (b[1]<1 || b[1]>12) || (b[0]<1 || b[0]>c[b[1]]);
        if (ojo){
            if (b[1]==29 && bisiesto==false){
                    System.exit(0);
            }
            //1.3.9.10.11
        }

        
        int dia = Integer.parseInt(a[0]);
        int mes = Integer.parseInt(a[1]);
        int anyo = Integer.parseInt(a[2]);
        
        
    }

}
