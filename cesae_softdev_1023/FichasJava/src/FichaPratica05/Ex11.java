package FichaPratica05;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [][] valores = new int[3][3];
        int i, j, maior, menor;
        // ler valores

        for(i =0; i < 3; i++){
            for(j = 0; j < 3; j++){
                System.out.println("Insira as colunas");
                valores [i][j] = input.nextInt();
            }
        }

       /* for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(maior < i[])
            }
        }*/

        // apresentar na tela

        for(i =0; i < 3; i++){
            for(j = 0; j < 3; j++){
                System.out.print(valores[i][j]);
            }
            System.out.println(" ");
        }

    }
}
