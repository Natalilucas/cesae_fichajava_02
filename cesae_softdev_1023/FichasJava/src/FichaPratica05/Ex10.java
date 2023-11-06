package FichaPratica05;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [][] valores = new int[3][5];
        int count = 0, valorConf;

        for(int i = 0; i < 3; i++){
            for (int j = 0; j < 5; j++){
                System.out.println("Insira os valores da matriz");
                valores[i][j] = input.nextInt();
                System.out.println(valores[i][j]);
                }
            }

        System.out.println("Informe qual valor quer conferir");
        valorConf= input.nextInt();

        for(int i = 0; i < 3; i++){
            for (int j = 0; j < 5; j++)
                if(valorConf == valores[i][j]){
                    count++;
                }
        }

        System.out.println(count);

    }

}
