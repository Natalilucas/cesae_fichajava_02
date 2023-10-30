package FichaPratica03;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int inicio, fim;

        System.out.println("Informe um número de inicio: ");
        inicio = input.nextInt();
        System.out.println("Informe um número para fim: ");
        fim = input.nextInt();

        while(inicio <= fim){
            System.out.println(inicio);
            inicio = inicio+1;
        }
    }
}


