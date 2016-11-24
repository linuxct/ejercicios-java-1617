package Part5;
import utilidades.Teclado;

/**
 * Ejercicio2.java (UTF-8)
 *
 * 22-nov-2016
 * @author linuxct
 */

public class Ejercicio2 {
    public static void main(String[] args) {
        boolean userinput=true;
        while (userinput==true){
            System.out.println("Introduzca una temperatura en grados centígrados");
            int celsius = Teclado.readInt();
            int kelvin = celsius + 273;
            System.out.println("La temperatura en grados kelvin es " + kelvin + "K");
            System.out.print("¿Desea continuar? S/n ");
            char userteclado = Teclado.readChar();
            if ((int)userteclado == 83 || (int)userteclado == 115){
                //do nothing, since userinput is still true
            } else if ((int)userteclado == 78 || (int)userteclado == 110){
                userinput=false;
            } else {
                System.out.println("Opción introducida no válida, ¡abortando!");
                System.exit(0);
            }
        }
    }
}
