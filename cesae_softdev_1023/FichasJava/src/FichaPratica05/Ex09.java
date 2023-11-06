package FichaPratica05;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [][] valores = new int[2][3];
        int i, j, soma=0;

        for(i =0; i < 5; i++){
            for(j = 0; j < 5; j++){
                System.out.println("Insira os valores da matriz para somar");
                valores [i][j] = input.nextInt();
                soma += valores[i][j];
                }
        }


        for(i =0; i < 5; i++){
            for(j = 0; j < 5; j++){
                System.out.print(valores[i][j]);
            }
            System.out.println(" ");
            System.out.println(soma);
        }
    }
}
