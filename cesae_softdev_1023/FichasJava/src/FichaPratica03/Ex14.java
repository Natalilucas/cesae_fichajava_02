package FichaPratica03;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, fatorial=0;
        System.out.println("Insira um número inteiro: ");
        n = input.nextInt();

        fatorial= n;
        n--;

        while(n > 0){
            System.out.println(n);
            fatorial *= n;
            n--;

        } System.out.println(fatorial);


    }
}
