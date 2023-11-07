package FichaPratica05;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [] valores1 = new int [10];
        int [] valores2 = new int [10];
        int [][] matriz10 = new int [2][10];

        for(int i = 0; i < 2; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println("Informe os valores para as linhas da matriz");
                valores1[i] = input.nextInt();
                matriz10[0] = valores1;
                System.out.println("Informe os valores para as colunas da matriz");
                valores2[j] = input.nextInt();

            }

       /* for(int i = 0; i < 10; i++){
            System.out.println("Informe os valores para as matrizes");
            valores2[i] = input.nextInt();
            matriz10[0][0] = valores2[i];
        }*/



       /* for(int i =0; i < 2; i++){
            for(int j = 0; j < 10; j++) {
                System.out.print(matriz10[i][j]);
            }
            System.out.println(" ");
        }*/

        }
    }
}
