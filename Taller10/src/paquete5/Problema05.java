package paquete5;

public class Problema05 {

    public static void main(String[] args) {
        String[][] estudiantes = {{"Sarah Ward", "Philip Payne"},
        {"Carrie Burton", "Lauren Rice"},
        {"Emma Escobar", "Lori Flores"},
        {"Steven West", "Toni Martin"}
        };
        char [][] inicial = new char[4][2];
        String [][] inicial2 = new String[4][2];
        String mensaje = "";
        
        for(int fila = 0; fila < estudiantes.length; fila++){
            for(int columna = 0; columna < estudiantes[fila].length; columna++){
                inicial[fila][columna] = estudiantes[fila][columna].charAt(0);
                inicial2[fila][columna] = String.valueOf(inicial[fila][columna]);
            }
        }
        for(int fila = 0; fila < estudiantes.length; fila++){
            for(int columna = 0; columna < estudiantes[fila].length; columna++){
                if(inicial2[fila][columna].equals("S") || 
                        inicial2[fila][columna].equals("P") || 
                        inicial2[fila][columna].equals("T")){
                    mensaje = String.format("%s%s\n", mensaje, estudiantes[fila][columna]);
                }
            }
        }
        System.out.println(mensaje);
    }
}
