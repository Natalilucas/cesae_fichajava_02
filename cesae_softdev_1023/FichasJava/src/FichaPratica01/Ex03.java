package FichaPratica01;

import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pi = 3.14;
        System.out.println("Informe o raio: ");
        double raio = input.nextDouble();
        double area = raio * raio * pi;
        double perimetro = 2.0 * pi * area;
        System.out.println("o resultado do perimetro é: " + perimetro);
    }


}
