package FichaPratica05;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [][] valores = new int[3][3];
        int i, j;

        // ler valores

        for(i =0; i < valores.length; i++){
            for(j = 0; j < valores.length; j++){
                System.out.println("Insira na matriz [" + i + "][" + j+"]");
                valores [i][j] = input.nextInt();
            }
        }

        // apresentar na tela

        for(i =0; i < valores.length; i++){
            for(j = 0; j < valores.length; j++){
                System.out.print(valores[i][j] + "\t");
            }
            System.out.println(" ");
        }



    }
}
