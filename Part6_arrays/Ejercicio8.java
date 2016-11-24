package Part6_arrays;
import java.util.Arrays;
import utilidades.Teclado;

/**
 * Ejercicio8.java (UTF-8)
 *
 * 24-nov-2016
 * @author linuxct
 */

public class Ejercicio8 {
    public static void main(String[] args) {
        //int [][]a = new int [10][10]; no hay forma de hacerlo sólo con int porque para empezar nos piden el nombre (String)
        Object [][]a = new Object [20][2]; //matriz de 20 filas x 2 columnas
        //Object [][]a = {{"Pepe","1000"}, {"Juan","2000"}, {"Antonio","1500"}, {"Federico","600"}}; array exclusivamente de demo, comentar el bloque del array de escritura.

        for (int i=0;i<a.length;i++){ //array de escritura
            for (int j=0;j<a[i].length;j++){
                System.out.println("Introduzca el nombre del empleado con índice " + i);
                a[i][j]=Teclado.readString(); //empieza en 1,1
                j++; //esto es lo más guarro que existe, pero es la única forma que se me ocurre de desplazar el array para escribir en la segunda columna en vez de en la primera 
                System.out.println("Introduzca su sueldo");
                a[i][j]=Teclado.readInt(); //ahora está en 1,2
            }
        }
        //System.out.println(Arrays.deepToString(a)); usar sólo para comprobar el contenido del array
        int sueldo=0,sueldotmp=0;
        String nombredelafortunado=null;
        for (int i=0;i<a.length;i++){ //array de lectura
            for (int j=0;j<a[i].length;j++){
                j++; //de momento quiero elegir siempre la segunda columna, ya que la primera son nombres, por tanto j++
                sueldotmp = (int) a[i][j];
                if (sueldotmp>sueldo){
                    sueldo = sueldotmp;
                    j--; //guarradas para sacar el nombre en vez del sueldo
                    nombredelafortunado = (String) a[i][j];
                    j++; //¿que por qué la dejo como estaba? porque si no se puede volver a cumplir la condición de arriba y quedarse en bucle infinito #DontQuoteMeOnThat
                }
            }
        }
        System.out.println("El empleado que más gana es " + nombredelafortunado + " con un sueldo de " + sueldo + "€.");
    }
}
