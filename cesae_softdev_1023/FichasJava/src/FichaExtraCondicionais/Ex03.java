package FichaExtraCondicionais;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double precoProduto;
        System.out.println("Informe o valor do produto: ");
        precoProduto = input.nextDouble();

        if(precoProduto > 100){
            precoProduto -= (precoProduto * 0.10);
            System.out.println( "Preço final " + precoProduto + " 10% ");
        } else {
            System.out.println("Preco final: " + precoProduto + " Sem desconto");
        }
    }
}
