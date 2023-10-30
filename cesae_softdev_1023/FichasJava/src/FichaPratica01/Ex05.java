package FichaPratica01;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        // media artimetrica de 03 valores
        Scanner input = new Scanner(System.in);
        int num1, num2, num3;
        double mediaArt, mediaPond, peso1= 0.2, peso2=0.3, peso3= 0.5;
        System.out.println("Para este programa o user deverá informar 03 numeros, insira o primeiro: ");
        num1 = input.nextInt();
        System.out.println("Informe o segundo número: ");
        num2 = input.nextInt();
        System.out.println("Informe o terceiro número: ");
        num3 = input.nextInt();
        mediaArt = (num1 + num2 + num3) / 3;
        System.out.println("A média aritmétrica simples é: " + mediaArt);
        mediaPond = ((num1*peso1) + (num2 * peso2) + (num3*peso3));
        System.out.println("A média ponderada é: " + mediaPond);
    }
}
