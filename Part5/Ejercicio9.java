package Part5;
import utilidades.Teclado;

/**
 * Ejercicio9.java (UTF-8)
 *
 * 23-nov-2016
 * @author linuxct
 */

public class Ejercicio9 {
    public static void main(String[] args) {
        System.out.println("Introduzca una frase");
        String frase = Teclado.readString();
        char[] a = frase.toCharArray();
        int contador=0;
        boolean warning=false;
        int caracteresmenosuno = frase.length()-1;
        for (int i=0;i<frase.length();i++){
            if (a[i]==' ' && a[i-1]!=' '){
                contador++; //en vez de contar palabras, ¿por qué no contamos los espacios entre ellas?
                if (i==caracteresmenosuno){
                    warning=true; //porque puede ser que el usuario haya acabado la frase con un espacio extra e innecesario
                }
            }
            if (i==caracteresmenosuno && a[i]==' ' && a[i-1]==' '){
                contador--; //si se da el caso de que estamos en la penúltima posición, y el caracter actual y el anterior son espacios, decrementamos contador
            }
        }
        if (!warning) {
            contador++; //porque siempre hay 1 espacio menos que palabras en una frase
        } 
        System.out.println("Hay " + contador + " palabras");
    }
}
