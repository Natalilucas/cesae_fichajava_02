package FichaPratica03;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int first, last;

        System.out.println("Informe um valor de início: ");
        first = input.nextInt();

        System.out.println("Informe um valor final: ");
        last=input.nextInt();

        while(first <= last){
            if(first % 5 == 0) {
                System.out.println(first);
            } first++;
        }
    }
}
