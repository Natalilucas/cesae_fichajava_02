package FichaPratica03;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int qtNumeros, numero, contador = 0, numarr = 0;

        System.out.println("Informe quantos numeros deseja inserir: ");
        qtNumeros = input.nextInt();

        while(contador < qtNumeros ){
            System.out.println("Introduza uma sequencia de numeros: ");
            numero = input.nextInt();
            contador++;
            numarr = numero;
        } 
        System.out.println(numarr);



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
