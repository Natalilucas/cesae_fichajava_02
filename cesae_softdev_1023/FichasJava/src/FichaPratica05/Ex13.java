package FichaPratica05;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [][] matrix = new int [4][4];
        int soma = 0, soma1 = 0, soma2= 0, soma3 = 0;

        for(int linhas = 0; linhas < matrix.length; linhas++){
            for(int colunas = 0 ; colunas < matrix.length; colunas++){
                System.out.println("Informe os valores das linhas e colunas");
                matrix[linhas][colunas]=input.nextInt();
            }
        }

        for(int linhas = 0 ; linhas < matrix.length; linhas++){
            for (int colunas = 0; colunas < matrix.length; colunas++){
                soma += matrix[0][0];
                soma1 += matrix[1][1];
                soma2 += matrix[2][2];
                soma3 += matrix[3][3];
                System.out.println(" O resultado da soma0= " + soma + "soma1 = " + soma1 +  "soma2 = " + soma2 + "soma3 = " + soma3 );

            }
        }

        for(int linhas =0; linhas < matrix.length; linhas++){
            for(int colunas = 0; colunas < matrix.length; colunas++){
                System.out.print(matrix[linhas][colunas]);
            }
            System.out.println(" ");
        }


    }
}
