package FichaPratica05;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [] comissoes = new int [12];
        int soma = 0;

        for (int i = 0; i < comissoes.length; i++){
            System.out.println("Insira a comissão de cada mês " + (i+1) + ":");
            comissoes[i] = input.nextInt();
        }

        for(int i = 0; i < comissoes.length; i++){
            System.out.println(comissoes[i]);
            soma += comissoes[i];
        } System.out.println(soma);
    }
}
