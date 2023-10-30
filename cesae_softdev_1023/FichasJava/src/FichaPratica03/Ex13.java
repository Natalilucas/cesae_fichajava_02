package FichaPratica03;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int qtNumeros, numeroAnterior, contador = 1, numeroAtual = 0;
        boolean crescente = true;

        System.out.println("Informe quantos numeros deseja inserir: ");
        qtNumeros = input.nextInt();

        System.out.println("Introduza uma sequencia de numeros: ");
        numeroAnterior = input.nextInt();

        while(contador < qtNumeros ){
            //se o numero a seguir é maior que o numero anterior
            System.out.println("Introduza uma sequencia de numeros: ");
            numeroAtual = input.nextInt();

            if(numeroAnterior>=numeroAtual){
                crescente = false;
            }

            numeroAnterior = numeroAtual;

            contador++;
        }

        if(crescente){
            System.out.println("Crescente");
        } else {
            System.out.println("Não é crescente");
        }

      /*  do{
            System.out.println("Introduza uma sequencia de numeros: ");
            numero = input.nextInt();
            contador++;
            numarr = numero;

        } while (contador < qtNumeros );

       */

        //System.out.println(numarr);

        /*if(numarr > numero){
            System.out.print("A sequencia está em ordem crescente.");
        } else {
            System.out.print("Não crescente!");
        }*/
    }
}
