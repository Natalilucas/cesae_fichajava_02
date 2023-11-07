package FichaPratica05;

import java.util.Scanner;

import static FichaPratica06.Ex05.*;

public class Ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] valores = new int[10];
        int i;

        for (i = 0; i < valores.length; i++) {
            System.out.println("Insira 10 valores " + i + ":");
            valores[i] = input.nextInt();
        }

        /*for(i = 0; i < valores.length; i++){
            if(valores[i] > maior){
                 maior = valores[i];
            }
        }*/

    int maior = maior(valores);
        System.out.println(maior);

    }
}
