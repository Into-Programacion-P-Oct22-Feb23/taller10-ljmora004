package paquete6;

public class Problema06 {

    public static void main(String[] args) {

        String[][] estudiantes = {{"Sarah Ward", "Philip Payne"},
        {"Carrie Burton", "Lauren Rice"},
        {"Emma Escobar", "Lori Flores"},
        {"Steven West", "Toni Martin"}
        };
        String mensaje = "";
        int[][] caracter = new int[4][2];
        
        for(int fila = 0; fila < estudiantes.length; fila++){
            for(int columna = 0; columna < estudiantes[fila].length; columna++){
                caracter[fila][columna] = estudiantes[fila][columna].length(); 
            }
        }
        for(int fila = 0; fila < estudiantes.length; fila++){
            for(int columna = 0; columna < estudiantes[fila].length; columna++){
                if(caracter[fila][columna] == 11){
                    mensaje = String.format("%s%s\n", mensaje, 
                            estudiantes[fila][columna]);
                }
            }
        }
        System.out.println(mensaje);
    }
}
