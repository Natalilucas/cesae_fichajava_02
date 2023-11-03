package FichaPratica05;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] valores = new int[10];
        int i, menor = 0;

        for (i = 0; i < valores.length; i++) {
            System.out.println("Insira 10 valores " + i + ":");
            valores[i] = input.nextInt();
        }

        menor = valores[0];
        for(i = 0; i < valores.length; i++){
            if(valores[i] < menor){
                menor = valores[i];
            }
        } System.out.println(menor);


    }
}
