package FichaPratica06;

import java.util.Scanner;

import static FichaPratica06.Ex05.*;

public class Ex06 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int opcao, tamanhoVetor;

        //escolha o tamanho do vetor
        System.out.println("Qual o tamanho do vetor?");
        tamanhoVetor = input.nextInt();

        //iforme o vetor
        System.out.println("Informe o vetor:");
        int vetor[] = new int[tamanhoVetor];

        // Intere no vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Insira os valores do seu vetor " + i + ":");
            vetor[i] = input.nextInt();
        }

        // enquanto não pedir para sair do programa, peça que o usuário escolha um número.
        do {

            System.out.println("Escolha a opção 1 para analisar o Maior Elemento ");
            System.out.println("Escolha a opção 2 para analisar o Menor Elemento ");
            System.out.println("Escolha a opção 3 para analisar se o vetor está em ordem crescente ");

            System.out.print("\nInsira a opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println(maior(vetor));
                    break;
                case 2:
                    System.out.println(menor(vetor));
                    break;
                case 3:
                    System.out.println(crescente(vetor));
                    break;
            }
        } while(opcao != 0);


    }
}
