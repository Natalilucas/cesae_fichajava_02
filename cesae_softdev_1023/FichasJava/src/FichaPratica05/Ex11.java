package FichaPratica05;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [][] valores = new int[3][3];
        int i, j, maior, menor;

        // ler valores

        for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++){
                System.out.println("Insira as colunas");
                valores [i][j] = input.nextInt();
            }
        }

        for(i =0; i < 3; i++){
            for(j = 0; j < 3; j++){
                System.out.print(valores[i][j]);
            }
            System.out.println(" ");
        }

        maior = valores[0][0];

        for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++){
                if(valores [i][j] > maior){
                    maior = valores[i][j];
                }
            }
        } System.out.println("O maior valor é " + maior);

        menor = valores[0][0];

        for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++){
                if(valores [i][j] < menor){
                    menor = valores[i][j];
                }
            }
        }System.out.println("O menor valor é " + menor);



    }
}
