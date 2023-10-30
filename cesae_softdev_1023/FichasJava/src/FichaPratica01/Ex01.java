package FichaPratica01;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {

        //Instanciar o scanner

        Scanner input = new Scanner(System.in);

        // Ler numero 1
        System.out.println("Insira um numero");
        int number1 = input.nextInt();
        System.out.println("Insira outro numero");
        int number2 = input.nextInt();
        int result = number1 + number2;

        System.out.println("O resultado da soma dos dois numeros, é: " + result);


    }

}

