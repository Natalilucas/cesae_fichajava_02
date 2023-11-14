package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_07 {
    public static void main(String[] args) throws FileNotFoundException {
        //Ler o ficheiro
        Scanner sc = new Scanner(new File("Ficheiros/exercicio_07.txt"));

        String linha;
        int qtLinhas = 0, qtPalavras = 0;

        while(sc.hasNextLine()) {
            linha = sc.nextLine();
            String[] itensdaLinha = linha.split(" ");
            qtLinhas++;
            //System.out.println(paraLinhas);

            for (String palavra : itensdaLinha) {
                qtPalavras++;
                // Você pode fazer algo com cada palavra aqui
            }
        }
        System.out.println("Quantidade de linhas: " + qtLinhas);
        System.out.println("Quantidade de palavras: " + qtPalavras);


    }


}






        //Imprimir o número de linhas e palavras







