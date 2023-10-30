package FichaPratica04;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberJg1, numberJg2;

        System.out.println(("Jogador 1 - Escolha um número de 0 a 100: "));
        numberJg1 = input.nextInt();

        System.out.println("Jogador 2 - Adivinhe qual número o jogador 1 informou (0 a 100): ");
        numberJg2 = input.nextInt();

        do{
           if(numberJg2 > numberJg1)
               System.out.println("O número informado é superior ao número do jogador 1!");
           System.out.println("O número informado é inferior ao número do jogador 1!");

        } while (numberJg2 != numberJg1);



    }
}
