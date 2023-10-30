package FichaPratica04;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int opcao = 0;

        while (opcao != 4){
                System.out.println("Escolha uma opção: 1) Criar, 2) Atualizar, 3) Eliminar, 4) Sair ");
                opcao = input.nextInt();
                if (opcao == 1 || (opcao == 2) || (opcao == 3)) {
                    System.out.println("A opção escolhida foi: " + opcao);
                } else if (opcao < 0 || opcao > 4){
                    System.out.println("A opção escolhida é inválida. Digite uma das opções");
                }
        }
        System.out.println("Você escolheu sair do programa!");
    }
}
