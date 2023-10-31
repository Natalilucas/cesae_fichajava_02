package FichaExtraCondicionais;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int idade;

        System.out.println("Informe sua idade: ");
        idade = input.nextInt();

        if ( idade >= 18 ){
            System.out.println("É maior de idade!");
        } else {
            System.out.println("Não é maior de idade");
        }
    }
}
