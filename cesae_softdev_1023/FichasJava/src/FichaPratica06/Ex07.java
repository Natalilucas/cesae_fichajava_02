package FichaPratica06;

import java.util.Scanner;

public class Ex07 {
    //TODO

    public static String desenhar() {
        Scanner input = new Scanner(System.in);

        char desenho;
        int linha, coluna;

        System.out.println("Informe o vetor:");
        linha = input.nextInt();
        coluna = input.nextInt();
        int matrix[][] = new int[linha][coluna];

        System.out.println("Insira o caracter que deseja colocar");
        desenho = input.next().charAt(1);

        for(desenho =0; desenho < matrix.length; desenho++){
            for(desenho = 0; desenho < matrix[0].length; desenho++){
                matrix[desenho][desenho] = input.nextInt();
            }
        }

        for(linha = 0, linha < matrix.length, linha++){
            for(coluna = 0; coluna < matrix[0].length; coluna++){
                System.out.print(matrix[linha][coluna] + "\t");
            }
            System.out.println(" ");
        }

    }


    public static void main(String[] args) {

    }

}
