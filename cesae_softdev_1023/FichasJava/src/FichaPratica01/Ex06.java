package FichaPratica01;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int valor1, valor2, temp;
        System.out.println("Informe dois valores, insira o primeiro: ");
        valor1 = input.nextInt();
        System.out.println("A variavél 1 é: " + valor1);
        System.out.println("Informe o segundo número: ");
        valor2 = input.nextInt();
        System.out.println("A variavél 2 é: " + valor2);
        System.out.println("Quando trocamos os valores, passa a ser: ");
        temp = valor1;
        valor1 = valor2;
        System.out.println("A variavél 1 é: " + valor1);
        valor2 = temp;
        System.out.println("A variavél 2 é: " + valor2);
    }
}
