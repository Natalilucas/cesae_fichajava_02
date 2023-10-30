package FichaPratica01;

import java.util.Scanner;

public class Ex04 {

    //Area da circuferencia

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pi=3.1415, area, raio;

        System.out.println("Insira o tamanho do raio");

        raio = input.nextDouble();
        area = pi * (raio*raio);
        System.out.println("A área da circuferêencia é: " + area);
    }

}
