package Part5;
import utilidades.Teclado;

/**
 * Ejercicio6.java (UTF-8)
 *
 * 23-nov-2016
 * @author linuxct
 */

public class Ejercicio5 {
    public static void main(String[] args) {
        System.out.println("¿Cuántas iteraciones debo hacer?");
        int n = Teclado.readInt();
        int a=1,b=1,c=0;
        System.out.println("\n" + a); //primer dato de la serie de fibonacci
	for (int i=1; i<n; i++){
		c=b+a;
		a=b;
		b=c;
                System.out.println(c);
	}
    }
}
