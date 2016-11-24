package Part3;
import utilidades.Teclado;

/**
 * Ejercicio7.java (UTF-8)
 *
 * 22-nov-2016
 * @author linuxct
 */

public class Ejercicio7 {
    public static void main(String[] args) {
        System.out.println("Introduzca el dividendo");
        double numero1 = Teclado.readDouble();
        System.out.println("Introduzca el divisor");
        double numero2 = Teclado.readDouble();
        if (numero2==0){
            System.out.println("El valor del divisor no puede ser 0, ¡abortando!");
            System.exit(0);
        }
        double resultado = numero1/numero2;
        System.out.println("El resultado de la división es " + resultado);
    }
}
