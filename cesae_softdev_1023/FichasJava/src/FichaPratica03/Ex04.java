package FichaPratica03;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero, valorCresc = 0;

        System.out.println("Informe um numero: ");

        numero = input.nextInt();

        while(valorCresc <= numero){
            System.out.println(valorCresc);
            valorCresc = valorCresc +1;
        }
    }
}
