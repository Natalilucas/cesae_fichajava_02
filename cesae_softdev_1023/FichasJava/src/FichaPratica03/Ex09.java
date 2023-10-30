package FichaPratica03;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numeroLido;

        System.out.println("Insira um número e descubra se ele é par: ");

        numeroLido = input.nextInt();

        while (numeroLido >= 2) {
            if(numeroLido%2 == 0) {
                System.out.println(numeroLido);
            }
            numeroLido--;
        }


    }
}
