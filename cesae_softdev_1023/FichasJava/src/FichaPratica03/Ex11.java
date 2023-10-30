package FichaPratica03;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);

        int numInteiro = 5, contador = 0;

        while(numInteiro > 0){
            System.out.println("Adivinhe o número que pare o programa: ");
            numInteiro = input.nextInt();

            if(numInteiro > 0 && numInteiro <= 25){
                contador = contador + 1;

            } else if (numInteiro > 25 && numInteiro <= 50){
                contador = contador + 1;

            } else if (numInteiro > 50 && numInteiro <= 75){
                contador = contador + 1;

            } else if(numInteiro > 76 && numInteiro <= 100){
                contador = contador + 1;

            }

        }
        System.out.println("[00,25]: " + contador);
        System.out.println("[26,50]: " + contador);
        System.out.println("[51,75]: " + contador);
        System.out.println("[76,100]: " + contador);
    }
}
