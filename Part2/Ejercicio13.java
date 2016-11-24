package Part2;
import utilidades.Teclado;

/**
 * Ejercicio13.java (UTF-8)
 *
 * 22-nov-2016
 * @author linuxct
 */

public class Ejercicio13 {
    public static void main(String[] args) {
        System.out.println("Introduzca el día en el que nació (2 cifras)");
        int dia = Teclado.readInt();
        if (dia >= 1 && dia <= 31) {
            System.out.println("Introduzca el mes en el que nació (2 cifras)");
            int mes = Teclado.readInt();
            if (mes >= 1 && mes <= 12) {
                System.out.println("Introduzca el año en el que nació (4 cifras)");
                int antildeo = Teclado.readInt();
                // probablemente la peor (pesadilla) optimización de variables de la historia. don't kill me pls 
                int dia_2 = dia%10;
                dia = dia/10;
                int dia_1 = dia%10;
                int mes_2 = mes%10;
                mes = mes/10;
                int mes_1 = mes%10;
                int antildeo_4 = antildeo%10;
                antildeo = antildeo/10;
                int antildeo_3 = antildeo%10;
                antildeo = antildeo/10;
                int antildeo_2 = antildeo%10;
                antildeo = antildeo/10;
                int antildeo_1 = antildeo%10;
                int suerte_temp = antildeo_1 + antildeo_2 + antildeo_3 + antildeo_4 + mes_1 + mes_2 + dia_1 + dia_2;
                int suerte_2 = suerte_temp%10;
                suerte_temp = suerte_temp/10;
                int suerte_1 = suerte_temp%10;
                int suerte = suerte_2+suerte_1;
                System.out.println("Su número de la suerte es el " + suerte);
            } else {
                System.out.println("Pruebe de nuevo");
            }
        } else {
            System.out.println("Pruebe de nuevo");
        }
    }
}
