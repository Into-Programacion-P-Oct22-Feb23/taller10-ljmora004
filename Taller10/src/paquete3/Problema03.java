package paquete3;

public class Problema03 {

    public static void main(String[] args) {

        String[][] notasCualitativas = new String[3][3];
        double[][] notasCuantitativas = {{7.1, 8, 10}, {3, 7, 9}, {10, 9, 2.1}};
        int fila;
        int columna;

        for (fila = 0; fila < notasCuantitativas.length; fila++) {
            for (columna = 0; columna < notasCuantitativas[fila].length; columna++) {
                if (notasCuantitativas[fila][columna] >= 0
                        && notasCuantitativas[fila][columna] <= 2.9) {
                    notasCualitativas[fila][columna] = "insuficiente";
                } else if (notasCuantitativas[fila][columna] >= 3
                        && notasCuantitativas[fila][columna] <= 4.9) {
                    notasCualitativas[fila][columna] = "regular";
                } else if (notasCuantitativas[fila][columna] >= 5
                        && notasCuantitativas[fila][columna] <= 7.9) {
                    notasCualitativas[fila][columna] = "buena";
                } else if (notasCuantitativas[fila][columna] >= 8
                        && notasCuantitativas[fila][columna] <= 9.5) {
                    notasCualitativas[fila][columna] = "muy buena";
                } else if (notasCuantitativas[fila][columna] >= 9.6
                        && notasCuantitativas[fila][columna] <= 10) {
                    notasCualitativas[fila][columna] = "sobresaliente";
                }
            }
        }
        for (fila = 0; fila < notasCuantitativas.length; fila++) {
            for (columna = 0; columna < notasCuantitativas[fila].length; columna++) {
                System.out.printf("%.2f = Nota %s\n", 
                        notasCuantitativas[fila][columna], 
                        notasCualitativas[fila][columna]);
            }
        }

    }
}
