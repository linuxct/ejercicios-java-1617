package Part2;
import utilidades.Teclado;

/**
 * Ejercicio9.java (UTF-8)
 *
 * 22-nov-2016
 * @author linuxct
 */

public class Ejercicio9 {
    public static void main(String[] args) {
        // mediante la fórmula de herón
        System.out.println("Introduzca el lado 1");
        int a = Teclado.readInt();
        System.out.println("Introduzca el lado 2");
        int b = Teclado.readInt();
        System.out.println("Introduzca el lado 3");
        int c = Teclado.readInt();
        double area = 1/4*(Math.sqrt((Math.pow(a,2)+Math.pow(b,2)+Math.pow(c,2))-2*(Math.pow(a,4)+Math.pow(b,4)+Math.pow(c,4)))); //n
        System.out.println("El resultado del area es " + area);
    }
}
