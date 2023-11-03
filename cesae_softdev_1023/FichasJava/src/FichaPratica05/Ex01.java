package FichaPratica05;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Declarar variaveis
        int [] vetor = new int[10];

        //Ler vetor

        for(int indice = 0; indice < 10; indice++){
            System.out.println("Insira um número no vetor");
            vetor[indice] = input.nextInt();
        }

        //Imprimir vetor

        for(int indice = 0; indice < 10; indice++){
            System.out.println("Vetor[" + indice+ "]:" + vetor[indice]);

        }


    }
}
