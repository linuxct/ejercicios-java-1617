package Part5;
import utilidades.Teclado;

/**
 * Ejercicio8.java (UTF-8)

 23-nov-2016
 * @author linuxct
 */

public class Ejercicio8 {
    public static void main(String[] args) {
        System.out.println("Introduzca el texto a cifrar");
        String userinput = Teclado.readString();
        System.out.println("Introduzca la clave de cifrado");
        int clave = Teclado.readInt();
        String resultado = "";
        int longitud = userinput.length();
        for(int i=0;i<longitud;i++){
            char c = (char)(userinput.charAt(i) + clave);
            if (c > 'z'){
                resultado += (char)(userinput.charAt(i) - (26-clave)); //empieza por el principio del abecedario otra vez
            } else {
                resultado += (char)(userinput.charAt(i) + clave);
            }
        }
        System.out.println("El texto cifrado es " + resultado); 
    }
}
