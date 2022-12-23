
package paquete1;

public class Problema01 {

    public static void main(String[] args) {
        
        double [][] notas = {{9, 10, 7, 8}, {10, 5, 7, 9}, {7, 9.4, 10, 9}};
        String [] estudiantes = {"Jerry Ponce", "Gabriela Lewis", "David Bell"};
        double [] promedios = new double [3];
        double promedio;
        double suma;
        int fila;
        int columna;
        
        for(fila = 0; fila < notas.length; fila++){
            suma = 0;
            for(columna = 0; columna < notas[fila].length; columna++){
                suma = suma + notas[fila][columna]; 
            }
            promedio = suma/4;
            promedios[fila] = promedio;
        }
        
        for(fila = 0; fila < estudiantes.length; fila++){
            System.out.printf("Estudiante: %s tiene un promedio de %.2f\n", 
                    estudiantes[fila], promedios[fila]);
        }
    }
    
}
