package FichaPratica01;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double produto1, produto2, produto3, precoTotal, precoDesc;
        System.out.println("Informe o valor do primeiro produto: ");
        produto1 = input.nextDouble();
        System.out.println("Informe o valor do segundo produto: ");
        produto2 = input.nextDouble();
        System.out.println("Informe o valor do terceiro produto: ");
        produto3 = input.nextDouble();
        precoTotal = produto1 + produto2 + produto3;
        System.out.println(" O valor total dos produtos é: " + precoTotal);
        precoDesc = precoTotal - (precoTotal * 0.10);
        System.out.println("O valor total com desconto passa a: " + precoDesc);


    }
}
