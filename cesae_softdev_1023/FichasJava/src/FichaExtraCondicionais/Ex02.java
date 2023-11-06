package FichaExtraCondicionais;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int peso;
        double pesoLua;

        System.out.println("Insira o seu peso em kg: ");
        peso = input.nextInt();

        if(peso > 0){
            pesoLua = peso * 0.16;
            System.out.println("Seu peso na lua seria: " + pesoLua);
        } else {
            System.out.println("Insira um valor válido");
        }
    }
}
