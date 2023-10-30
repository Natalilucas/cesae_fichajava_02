package FichaPratica03;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numeroPedido = 5, soma =0, media = 0, contador = 0;


        //System.out.println("Adivinhe o número premiado: ");
        //numeroPedido = input.nextInt();

        while(numeroPedido != -1 ){
            System.out.println("Adivinhe o número premiado: ");
            numeroPedido = input.nextInt();
            soma = soma + numeroPedido;
            contador = contador + 1;
        }
        contador = contador -1;
        media = (soma + 1) / (contador);
        System.out.println(media);

    }
}
