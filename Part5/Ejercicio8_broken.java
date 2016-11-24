package Part5;
import utilidades.Teclado;

/**
 * Ejercicio8_broken.java (UTF-8)
 *
 * 23-nov-2016
 * @author linuxct
 */

public class Ejercicio8_broken {
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
                resultado += (char)(userinput.charAt(i) - (26-clave));
            } else {
                resultado += (char)(userinput.charAt(i) + clave);
            }
        }
        System.out.println("El texto cifrado es " + resultado); 
        // El algoritmo está roto, revisar la clave. Si uso clave 13, funciona bien, si uso clave 12 en verdad usa clave 14, y si uso clave 14 usa la clave 12. 
    }
}
