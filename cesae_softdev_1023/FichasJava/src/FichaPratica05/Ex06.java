package FichaPratica05;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [] valores = new int [10];
        int i = 0, numAnterior = valores[0], contador;
        boolean crescente = false;


        for (i = 0; i < valores.length; i++){
            System.out.println("Informe um conjunto de valores: " + i);
            valores[i] = input.nextInt();

            if (valores[i] > numAnterior){
                numAnterior = valores[i];
                crescente = true;
            } else {
                crescente=false;
            }

        }

        if(crescente){
            System.out.println("Crescente");
        } else {
            System.out.println("Não é crescente");
        }

    }
}
