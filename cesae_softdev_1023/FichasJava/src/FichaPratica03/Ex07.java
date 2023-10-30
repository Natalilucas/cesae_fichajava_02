package FichaPratica03;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int antecessor = 0, numero, sucessor = 0;

        System.out.println("Informe um número: ");
        numero = input.nextInt();

        antecessor = numero - 5;
        sucessor  = numero + 5;

        while (numero > antecessor) {
            System.out.println(antecessor);
            antecessor = antecessor + 1;
        }

        while (numero < sucessor) {
            System.out.println(numero);
            numero = numero + 1;
        }

        /**
         * sucessor= num+5;
         * num = num -5;
         *
         * while(num<=sucessor){
         *  if(num!=sucessor-5)
         *  System.out.println(num);
         * }  else {
         *     System.out.println();
         * }
         * num++;
         */
    }
}
