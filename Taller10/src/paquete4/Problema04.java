
package paquete4;

import java.util.Scanner;
import java.util.Locale;

public class Problema04 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double[][] datos = new double[2][2];
        int fila;
        int columna;
        for(fila = 0; fila < datos.length; fila++){
            for(columna = 0; columna < datos[fila].length; columna++){
                System.out.printf("Ingrse el valor de la fila [%d] "
                        + "columna [%d]:\n", fila, columna);
                datos[fila][columna] = entrada.nextDouble();
            }
        }
        System.out.println("------------------------------------------------");
        System.out.println("El arreglo queda:");
        for(fila = 0; fila < datos.length; fila++){
            for(columna = 0; columna < datos[fila].length; columna++){
                System.out.printf("%.2f\t",
                        datos[fila][columna]);
            }
            System.out.println();
        }
    }
    
}
