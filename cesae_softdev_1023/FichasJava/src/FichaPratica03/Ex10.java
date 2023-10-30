package FichaPratica03;

import java.util.Scanner;

public class    Ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int limit, jump, count = 0;

        System.out.println("Informe um valor para limite: ");
        limit = input.nextInt();

        System.out.println("Defina um valor de intervalor: ");
        jump = input.nextInt();


        while (limit > count) {
            System.out.print(count + " ");
            count = count + jump;
        }
    }
}
