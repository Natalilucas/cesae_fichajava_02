package FichaPratica04;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nPrimo, count;
        boolean ePrimo = true;

        System.out.println("Vamos ver se o número é primo: ");
        nPrimo = input.nextInt();

        for (count = 2; count < nPrimo; count++) {
            if (nPrimo % count == 0) {
                ePrimo = false;
                break; // Se encontrarmos um divisor, podemos sair do loop imediatamente.
            }
        }
        /*while(nPrimo%2 != 0){
            if()
        }*/

            int _var1 = 1;

        if (ePrimo && nPrimo > 1) {
            System.out.println("O número " + nPrimo + " é primo.");
        } else {
            System.out.println("O número " + nPrimo + " não é primo.");
        }


    }
}


