package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_11 {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(new File("Ficheiros/exercicio_11.csv"));

        String linha = sc.nextLine();
        String[][] matriz = new String[46][4];

        while (sc.hasNextLine()) {
            linha = sc.nextLine();
            String[] vetor = linha.split(",");

            for (int i = 0; i < vetor.length; i++) {
                matriz[0][i] = vetor[0];
                matriz[1][i] = vetor[1];
                matriz[2][i] = vetor[2];
                matriz[3][i] = vetor[3];
                System.out.println(matriz[0][i]);
                System.out.println(matriz[1][i]);
                System.out.println(matriz[2][i]);
                System.out.println(matriz[3][i]);
                i++;
               /*

            int indice = 0;

          if (vetor.length >= 4) {
                matriz[indice][0] = vetor[0];
                matriz[indice][1] = vetor[1];
                matriz[indice][2] = vetor[2];
                matriz[indice][3] = vetor[3];

                // Imprime os valores atribuídos
                System.out.println(matriz[indice][0]);
                System.out.println(matriz[indice][1]);
                System.out.println(matriz[indice][2]);
                System.out.println(matriz[indice][3]);

                // Incrementa o índice
                indice++;

                */
            }


        }


    }
}
