package FichaPratica05;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] valores = new int[2];
        int i, media = 0, soma = 0;

        for(i = 0; i < valores.length; i++){
            System.out.println("Informe um valor: " + i);
            valores[i] = input.nextInt();
            soma += valores[i];
            media = soma / valores.length;
        } System.out.println("tamanho array " + valores.length + " soma " + soma + " media " + media);


    }
}
