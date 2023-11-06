package FichaPratica05;

import java.util.Arrays;
import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [] valores = new int [4];
        int valorPar = valores[0];
        int maior = 0;

        for (int i = 0; i < valores.length; i++) {
            System.out.println("Insira os valores");
            valores[i] = input.nextInt();
            if(valores[i] % 2 == 0){
                valorPar = valores[i];
            }
            if(valorPar > maior){
                maior = valorPar;
            }System.out.println(maior);
        } System.out.println(valorPar);



    }
}
