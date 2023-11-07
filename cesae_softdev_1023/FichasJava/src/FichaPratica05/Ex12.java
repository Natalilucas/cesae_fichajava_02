package FichaPratica05;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] valores1 = new int[10];
        int[] valores2 = new int[10];

        int[][] matriz10 = new int[10][2];

        for (int i = 0; i < valores1.length; i++) {
            System.out.println("Informe os valores para as linhas da matriz");
            valores1[i] = input.nextInt();
        }

        for (int i = 0; i < valores2.length; i++) {
            System.out.println("Informe os valores para a primeira matriz: ");
            valores2[i] = input.nextInt();
        }


        for (int i = 0; i < 10; i++) {
            System.out.println("Informe os valores para a segunda matriz: ");
            valores2[i] = input.nextInt();
        }


        for (int indice = 0; indice < matriz10.length; indice++) {
            matriz10[indice][0] = valores1[indice];
            matriz10[indice][1] = valores2[indice];
        }
/*

        // colocar valores na matriz na primeira coluna
        for (int i = 0; i < matriz10.length && i < valores1.length ; i++) {
            for (int j = 0; j < 1; j++) {
                matriz10[i][j] = valores1[i];
            }
        }

        // colocar valores na matriz na segunda coluna
        for (int i = 0; i < matriz10.length && i < valores2.length; i++) {
            for (int j = 1; j < 2; j++) {
                matriz10[i][j] = valores2[i];
            }
        }

        // imprimir matriz
        for (int i = 0; i < matriz10.length; i++) {
            for (int j = 0; j < matriz10[0].length; j++) {
                System.out.print(matriz10[i][j]+"\t");
            }
            System.out.println();
        }
    }
*/

    }
}
