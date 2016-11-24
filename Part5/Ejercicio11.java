package Part5;
import utilidades.Teclado;

/**
 * Ejercicio11.java (UTF-8)
 *
 * 23-nov-2016
 * @author linuxct
 */

public class Ejercicio11 {
    public static void main(String[] args) {
        System.out.println("Introduzca una frase");
        String frase = Teclado.readString();
        System.out.println("Introduzca el carácter que desea contar");
        char caracter = Teclado.readChar();
        char[] a = frase.toCharArray(); //y esto no es de StackOverfl0w, eh ;) #CosechaPropia
        int contador=0;
        for (int i=0;i<frase.length();i++){
            if (a[i]==caracter){
                contador++;
            }
        }
        System.out.println("El carácter " + caracter + " se repite " + contador + " veces.");
    }
}
