package FichaPratica03;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //int numeroImpar = 531;

      /*  while (numeroImpar >= 531 && numeroImpar <= 750) {
            if (numeroImpar % 2 != 0) {
                System.out.println(numeroImpar);
            }
            numeroImpar = numeroImpar + 1;
        }*/

        int numero, resultado = 0, contador = 1;
        System.out.println("Informe dois valores, insira o primeiro: ");
        numero = input.nextInt();

            while (contador <=10) {
                        resultado = numero * resultado;
                        System.out.println(numero + " " + contador + " " + resultado );
                        contador++;
                }

    }
}
